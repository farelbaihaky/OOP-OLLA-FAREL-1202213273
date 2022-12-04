z = []
total = int(input("Masukkan jumlah nilai : "))
for i in range(1,total+1):
    nilai = int(input(f'Masukkan nilai yang ke-{i} :'))
    z.append(nilai) 
print(z)
tanya = int(input("Nilai yang ingin dicari :"))
def search(data,key):
    posisi=[]
    n=len(data)
    for i in range (n):
        if data[i]==key:
            posisi.append(i+1)
            print('nilai: ',key,'ditemukan pada posisi ke: ',posisi)
search(z,tanya)