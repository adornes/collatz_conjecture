#
# This version in Python exploits some nice features of the language and
# the functional programming paradigm, such as recursivity, lambda functions, 
# xrange
#
def collatz_steps(i):
  if (i < 1):
    raise "the number must be greater than zero." 

  def iterate(i, l):
    return (l + [i] if(i == 1) 
    else iterate(i/2, l + [i]) if(i % 2 == 0) 
    else iterate(i * 3  + 1, l + [i]))
  
  return iterate(i, [])

N = 100

def str_steps(i): 
  return ",".join(map(lambda s: str(s), collatz_steps(i)))

experiments = map(lambda i: "Experiment({0}, [{1}])".format(i, str_steps(i)), 
                  xrange(1, N+1))

for e in experiments: 
  print e
