#include <iostream>
#include <limits.h> //for INT_MIN & INT_MAX
using namespace std;

int main()
{
    int n;
    cout << "Enter the size of array" << endl;
    cin >> n;

    int a[n];
    cout << "Enter the elemens of array" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    int maxsum = INT_MIN;
    int cursum = 0;
    for (int i = 0; i < n; i++)
    {
        cursum += a[i];
        if (cursum > maxsum)
            maxsum = cursum;
        if (cursum < 0)
            cursum = 0;
    }
    cout << "Maximum Subarray sum is " << maxsum;
}