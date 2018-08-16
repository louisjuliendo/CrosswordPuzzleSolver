words([a,b,a,l,o,n,e],abalone).
words([a,b,a,n,d,o,n],abandon).
words([e,n,h,a,n,c,e],enhance).
words([a,n,a,g,r,a,m],anagram).
words([e,l,e,g,a,n,t],elegant).
words([c,o,n,n,e,c,t],connect).

solver(A,B,C,D,E,F):- words([_,X1Y1,_,X1Y2,_,X1Y3,_],A), words([_,X2Y1,_,X2Y2,_,X2Y3,_],B), words([_,X3Y1,_,X3Y2,_,X3Y3,_],C), words([_,X1Y1,_,X2Y1,_,X3Y1,_],D), words([_,X1Y2,_,X2Y2,_,X3Y2,_],E), words([_,X1Y3,_,X2Y3,_,X3Y3,_],F).
