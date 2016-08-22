module lab3q3(a,b,c,d,f);
input a,b,c,d;
output f;
assign f = (b|d)&(~a|b)&(~a|c|~d)&(a|~c|~d);
endmodule
