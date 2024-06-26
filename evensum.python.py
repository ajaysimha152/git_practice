#Accept multiple digit number and display sum of odd digits and even digits//
num=int(input('Enter a multiple digit number'))
odd_sum=0
even_sum=0
while num>0:
    dig=num%10
    if dig%2==0:
        even_sum+=dig
    else:
        odd_sum+=dig
    num//=10
print('ODD SUM=',odd_sum)
print('EVEN SUM=',even_sum)
        
    
