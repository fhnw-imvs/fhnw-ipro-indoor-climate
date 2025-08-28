import matplotlib.pyplot as plt
import random

# ---- Plot setup ----
fig, ax = plt.subplots()

# generate some random values between 120 and 140
values = [random.randint(120, 140) for _ in range(20)]

ax.plot(range(len(values)), values, marker="o")
ax.set_title("Show 20 random values (only once)")
ax.set_xlabel("row #")
ax.set_ylabel("ID")

plt.show()

print("finish")


