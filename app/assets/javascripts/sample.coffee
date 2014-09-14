gold = silver = rest = "unknown"

awardMedals = (first, second, others...) ->
  gold = first
  silver = second
  rest = others

contenders = [
  "Mr.A"
  "Mr.B"
  "Mr.C"
  "Mr.D"
  "Mr.E"
]

awardMedals contenders...

alert "Gold: " + gold
alert "Silver: " + silver
alert "The Field: " + rest
