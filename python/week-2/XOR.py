import numpy as np
import torch
import torch.nn as nn
import torch.optim as optim
import matplotlib.pyplot as plt

X = np.array([
    [0, 0],
    [0, 1],
    [1, 0],
    [1, 1]
])

Y = np.array([
    [0],
    [1],
    [1],
    [0]
])

X_tensor = torch.FloatTensor(X)
Y_tensor = torch.FloatTensor(Y)

# Define the network
class XORNet(nn.Module):
    def __init__(self):
        super(XORNet, self).__init__()
        self.hidden = nn.Linear(2, 4)   # 2 inputs → 4 hidden
        self.output = nn.Linear(4, 1)   # 4 hidden → 1 output
        self.sigmoid = nn.Sigmoid()

    def forward(self, x):
        x = self.sigmoid(self.hidden(x))
        x = self.sigmoid(self.output(x))
        return x

# Create network
torch.manual_seed(42)
model = XORNet()

# Loss function and optimizer
criterion = nn.MSELoss()
optimizer = optim.SGD(model.parameters(), lr=2.0)

# Training loop
pytorch_loss_history = []

print("Training PyTorch model...")
print("-" * 50)

for i in range(10000):
    # Forward pass
    predictions = model(X_tensor)
    loss = criterion(predictions, Y_tensor)
    pytorch_loss_history.append(loss.item())

    # Backward pass (automatic!)
    optimizer.zero_grad()  # Clear previous gradients
    loss.backward()        # Compute gradients (THIS IS BACKPROP!)
    optimizer.step()       # Update weights

    if i % 2000 == 0:
        print(f"Iteration {i:5d} | Loss: {loss.item():.6f}")

print("-" * 50)
print(f"Iteration {10000:5d} | Loss: {pytorch_loss_history[-1]:.6f}")

# Compare results
print("\nPyTorch Final Predictions:")
print("-" * 50)
with torch.no_grad():
    final_preds = model(X_tensor)
    for i in range(len(X)):
        pred = final_preds[i].item()
        print(f"Input: {X[i]} → Prediction: {pred:.4f} (Target: {Y[i][0]})")

plt.figure(figsize=(10, 5))

plt.plot(pytorch_loss_history, linewidth=0.8, label="PyTorch")
plt.xlabel("Iteration")
plt.ylabel("Loss")
plt.title("PyTorch Loss Curve")
plt.grid(True, alpha=0.3)
plt.legend()

plt.tight_layout()
plt.savefig("loss.jpeg", dpi=200)

