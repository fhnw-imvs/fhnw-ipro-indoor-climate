# License https://creativecommons.org/publicdomain/zero/1.0
# based on $REPO_PATH/prompts/duck.ai_20250829T094500Z.txt

import csv

data = [
    ["City", "ZIP Code"],
    ["Bern", 3000],
    ["Basel", 4000],
    ["Zürich", 8000],
]

with open("data.csv", mode='w', newline='\n') as file:
    writer = csv.writer(file)
    writer.writerows(data)
