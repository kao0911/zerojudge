# UVA 10931 - 奇偶性

def count_parity(I):
    binary = bin(I)[2:]  # 轉換為二進制並去掉前綴'0b'
    #bin(I): 这个内置函数将整数 I 转换为二进制字符串。例如，如果 I 是 10，bin(I) 会返回 '0b1010'。
    #[2:]: 这是一个字符串切片操作。它从字符串的第三个字符开始（索引为2）截取到末尾。这样做的目的是去掉二进制字符串前面的 '0b' 前缀。
    parity = binary.count('1')  # 計算1的數量
    return binary, parity

def main():
    while True:
        I = int(input())
        if I == 0:
            break
        #二進制, 奇偶性 = 計算奇偶性(I)
        binary,parity = count_parity(I)
        #count_parity(I): 这是对 count_parity 函数的调用，传入参数 I（用户输入的整数）。
        #binary, parity = ...: 这是Python中的多重赋值（或称为序列解包）。它假设 count_parity 函数返回两个值，并将这两个值分别赋给 binary 和 parity 变量。
        print(f"The parity of {binary} is {parity} (mod 2).")

if __name__ == "__main__":
    main()
