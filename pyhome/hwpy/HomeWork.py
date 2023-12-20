import pandas as pd

file = 'penguins.csv'

df = pd.read_csv(file)


import random

lst = ['robot'] * 10
lst += ['human'] * 10
random.shuffle(lst)
data = pd.DataFrame({'whoAmI':lst})
data.head()

mains = data['whoAmI'], unique()
result = pd.DataFrame()
for i in mains:
    result[i] = (data['whoAmI'] == i).astype(int)
result.head(20)





