module lab3q1(a,b,d,f);
input a,b,d;
output f;
assign f=(~b&~d)|(~a&b)|(b&d);
endmodule
