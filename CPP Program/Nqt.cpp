#include <iostream>
#include <cmath>  // For pow function
using namespace std;

int main() {
    int N;
    cout << "Enter the position (N): ";
    cin >> N;

    int result;

    if (N % 2 == 0) {
        result = pow(3, (N-1) / 2);
    } else {
        result = pow(2, (N-1)/ 2);
    }

    cout << "Answer is : " << result << endl;

    return 0;
}
