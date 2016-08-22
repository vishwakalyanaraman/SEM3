module lab3q4(a,b,c,f);
input a,b,c;
output f;
assign f= (a&b)|(b&c)|(a&c);
endmodule
