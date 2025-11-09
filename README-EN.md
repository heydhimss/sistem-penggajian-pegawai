# Employee Payroll System / Sistem Penggajian Pegawai

A comprehensive Java-based payroll calculation system for different types of employees with detailed JavaDoc documentation.

## 🚀 Features

- **3 Employee Types Support:**
  - Permanent Employees (Pegawai Tetap)
  - Contract Employees (Pegawai Kontrak)  
  - Partner Employees (Pegawai Mitra)

- **Advanced Salary Calculations:**
  - Salary based on years of service
  - Attendance-based allowances
  - Comprehensive deduction system
  - Bonus system for partners

- **User-Friendly Interface:**
  - Interactive menu system
  - Input validation
  - Detailed salary breakdown
  - Multi-language support (Indonesian)

## 📋 System Overview

### Employee Types & Salary Structure:

#### 🏢 Permanent Employee (Pegawai Tetap)
- **Base Salary** (based on years of service):
  - < 5 years: Rp 3,000,000
  - 5-9 years: Rp 4,500,000
  - 10-14 years: Rp 6,500,000
  - ≥ 15 years: Rp 10,000,000
- **Allowances**: Attendance + meal + fixed allowances
- **Deductions**: Absence penalty + insurance (20%) + tax (12%)

#### 📄 Contract Employee (Pegawai Kontrak)
- **Base Salary**: Rp 2,500,000 (fixed monthly)
- **Allowances**: Attendance allowance + fixed allowance
- **Deductions**: Absence penalty + insurance (10%) + tax (8%)

#### 🤝 Partner Employee (Pegawai Mitra)
- **Daily Wage**: Daily attendance × Rp 100,000
- **Bonus**: Rp 300,000 (if attendance ≥ 22 days/month)
- **Deductions**: Absence penalty + tax (5%)

## 🛠️ Technology Stack

- **Language**: Java 8+
- **Build System**: NetBeans Project
- **Documentation**: JavaDoc
- **Architecture**: Object-Oriented Programming (OOP)

## 📁 Project Structure

```
src/main/
├── Anggota.java          # Abstract base class
├── Tetap.java            # Permanent employee implementation
├── Kontrak.java          # Contract employee implementation
├── Mitra.java            # Partner employee implementation
├── Menu.java             # User interface handler
├── Main.java             # Main application entry point
├── Rincian.java          # Salary details container
└── package-info.java     # Package documentation
```

## 🚀 How to Run

### Using VS Code:
1. Open VS Code
2. Open `Main.java`
3. Click the "Run" button (▶️) above the `main()` method

### Using Command Line:
```bash
# Compile
javac -d build/classes src/main/*.java

# Run  
java -cp build/classes main.Main
```

### Using NetBeans:
1. Open NetBeans IDE
2. File → Open Project
3. Select project folder
4. Right-click project → Run

## 📖 Documentation

This project features comprehensive JavaDoc documentation for all classes and methods:

- Complete class descriptions with purpose and functionality
- Detailed method documentation with parameters and return values
- Usage examples and code relationships
- Professional documentation standards

### Generate HTML Documentation:
```bash
javadoc -d docs -sourcepath src -subpackages main -encoding UTF-8 -charset UTF-8 -windowtitle "Employee Payroll System" -doctitle "Employee Payroll System Documentation" -author -version -use
```

## 💡 Key Features

- **Input Validation**: Ensures data integrity
- **Modular Design**: Easy to extend and maintain
- **Comprehensive Calculations**: All salary components included
- **User-Friendly Interface**: Clear menu navigation
- **Detailed Reports**: Complete salary breakdown

## 👨‍💻 Author

- **Name**: Dhimas Kurnia Putra Supriyadi
- **Student ID**: 10122307
- **Class**: CCDP
- **Version**: 1.0
- **Year**: 2024

## 📄 License

This project is created for educational purposes as part of a Java programming assignment.

## 🤝 Contributing

This is an academic project. Feel free to fork and modify for learning purposes.

---

**🌟 Star this repository if you find it helpful!**