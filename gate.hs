and1::Bool->Bool->Bool
and1 x y|x==True && y==True=True
 |otherwise=False

or1::Bool->Bool->Bool
or1 x y|x==False && y==False=False
 |otherwise=True

main=do
    putStrLn("True And True")
    print(and1 True True)
    putStrLn("False And True")
    print(and1 False True)
    putStrLn("True And False")
    print(and1 True False)
    putStrLn("False And False")
    print(and1 False False)
    
    putStrLn("True or True")
    print(or1 True True)
    putStrLn("False or True")
    print(or1 False True)
    putStrLn("True or False")
    print(or1 True False)
    putStrLn("False or False")
    print(or1 False False)    
   
