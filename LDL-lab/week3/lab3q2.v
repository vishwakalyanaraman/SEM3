module lab3q2(a,b,c,d,f);
input a,b,c,d;
output f;
assign f = (~b&~d)|(c&~d)|(a&b&~c&d);
endmodule
