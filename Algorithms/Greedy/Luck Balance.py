# Enter your code here. Read input from STDIN. Print output to STDOUT
n, k = raw_input().strip().split(' ')
n, k = [int(n), int(k)]
imp = []
maxLuck=0
for x in range(n):
    l, t = raw_input().strip().split(' ')
    l, t = [int(l), int(t)]
    if t==0:
        maxLuck+=l
    else:
        imp.append(l)
imp.sort(reverse=True)
for y in range(len(imp)):
    if y<k:
        maxLuck+=imp[y]
    else:
        maxLuck-=imp[y]
print maxLuck
