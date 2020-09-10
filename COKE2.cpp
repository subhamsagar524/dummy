#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int t;
	cin >> t;
	
	while(t--)
	{
	    int n, m, k, l, r;
	    cin >> n >> m >> k >> l >> r;
	    
	    int minimum = 1e9;     //for 1000000000
	    for (int i = 1; i <= n; i++)
	    {
	        int c, p;
	        cin >> c >> p;
	        
	        for (int j = 1; j <= m; j++)
	        {
	            if (c > k + 1)
	                c--;
	            else if (c < k-1) 
	                c++;
	            else if (c >= (k-1) && c <= (k+1))
	                c = k;
	        }
	        
	        if (c >= l && c <= r)
	            minimum = min(minimum, p);
	    }
	    
	    if (minimum == 1e9)
	        cout << -1 << endl;
	    else
	        cout << minimum << endl;
	}
	
	return 0;
}
