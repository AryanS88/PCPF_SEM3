#include <iostream>
using namespace std;
class Racing{
	
	public:
	int race(int time,int drivers){
		return time*1.0;
	
};	
    	

	int race(double distance,int drivers){
	     return  distance;	
};	
};
int main()
{
	Racing f1;
	std::cout<<"the race will begin in "<<f1.race(11,2)<<" mins ";
	std::cout<<" \n ";
	std::cout<<"the race is "<<f1.race(10.7,2)<<"Kms";
}
