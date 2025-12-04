const fs = require("fs");

function cleanFilePromise(filePath) {
  return new Promise(function (resolve, reject) {
    fs.readFile(filePath, "utf8", function (err, data) {
      if (err) {
        return reject(err);
      }
      data = data.trim();
      fs.writeFile(filePath, data, function (writeErr) {
        if (writeErr) {
          return reject(writeErr);
        }
        resolve(data); // Modified to resolve with trimmed data
      });
    });
  });
}

async function trimFile() {
  try {
    await cleanFilePromise("./a.txt");
    console.log("done");
  } catch (error) {
    console.error("Error trimming file:", error);
  }
}

trimFile();

// without async await you would do something like 
// cleanFilePromise("a.txt").then(onDone).catch(onError);