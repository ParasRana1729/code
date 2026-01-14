const fs = require('fs');
const { Command } = require('commander');
const program = new Command();

program
  .name('counter')
  .description('CLI to count number of words or lines in a file');

program.command('wcount')
  .description('CLI to count number of words in a file')
  .argument('<file>', 'file to count from') // <..> strict [..] optional argument
  .action((file)=>{
    fs.readFile(file,'utf-8',(err,data)=>{
      if(err){
        console.log(err);
      }else{
        console.log(`Total number of words in this file : ${data.trim().split(/\s+/).length}`);
      }
    })}
  );

program.command('lcount')
  .description('CLI to count number of lines in a file')
  .argument('<file>', 'file to count from')
  .action((file)=>{
    fs.readFile(file, 'utf-8', (err, data)=>{
      if(err){
        console.log(err);
      } else{
        console.log(`Total number of lines in this file : ${data.split('\n').length}`);
      }
    })
  })
program.parse();
