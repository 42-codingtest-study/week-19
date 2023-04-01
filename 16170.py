import datetime
now = datetime.datetime.now() + datetime.timedelta(hours=9)

print(now.year, now.month, now.day, sep='\n')