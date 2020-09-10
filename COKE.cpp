#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int t, n, m, k, l, r;
    cin >> t;
    
    int price[n], result[t], c, p;
    int i = 0, j = 0;
    
    while(t > 0)
    {
        cin >> n >> m >> k >> l >> r;
        
        for(int i = 0; i < n; i++)
        {
            cin >> c >> p;
            while(m != 0)
            {
                if(c > k + 1)
                    c--;
                else if(c < k - 1)
                    c++;
                else if(k < 1 <= c && c <= k + 1)
                    c = k;
                
                m--;
            }
            
            if(c >= l && c <= r)
                price[i] = p;
                
            i++;
        }
        
        sort(price, price + n);
        result[j] = price[0];
        j++;
        
        t--;
    }
    
    for(i = 0; i < t; i++)
        cout << result[i] << endl;
        
    return 0;
}
