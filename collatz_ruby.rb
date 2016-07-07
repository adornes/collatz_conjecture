#
# This version in Ruby exploits some nice features of the language and
# the functional programming paradigm, such as recursivity, range,  ...
#
def collatz_steps i
  raise "the number must be greater than zero." unless i > 0

  def iterate i, l
    if(i == 1) 
      return l << i
    elsif(i % 2 == 0) 
      return iterate(i/2, l << i)
    else 
      return iterate(i * 3  + 1, l << i)
    end
  end
  
  iterate(i, [])
end

N = 100

experiments = (1..N).map{ |i| "Experiment(#{i}, [#{collatz_steps(i).join(",")}])" }

experiments.each{ |e| puts e }   
