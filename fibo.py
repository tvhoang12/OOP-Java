import numpy.random as npr
import numpy as np

file = open("DATA.in", "w")

for i in range(100000):
    file.write(str(npr.randint(0, 1000)))
    file.write("\n")
