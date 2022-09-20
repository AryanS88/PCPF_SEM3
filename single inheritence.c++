#include <iostream>
using namespace std;

//Base class
class Parallelogram{
public:
 int lside;
 int nside=4;
 int base;


 void stats()
 {
 cout<<"the shape has "<<nside<<" sides \n";
 }

};

class rectangle:public Parallelogram{
public :
int base=10;
int height=20;
int area=base*height;
};

int main(){
rectangle rect1;
rect1.stats();
cout<<"the area of rectangle is "<<rect1.area;
}
/*
output :
the shape has 4 sides 
the area of rectangle is 200
*/
