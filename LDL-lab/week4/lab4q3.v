module lab4q3(a,b,c,d,f,g);
input a,b,c,d;
output f,g;
assign f= (~a&~c&~d)|(~b&c&~d)|(a&~b&~c&d)|(~a&b&c);
assign g= (~a&~c&~d)|(~b&c&~d)|(a&~b&~c&d)|(a&b&d);
endmodule
