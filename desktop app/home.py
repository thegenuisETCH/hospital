import sys
from PyQt5 import QtCore, QtGui , QtWidgets
from PyQt5.QtGui import QIcon



def window_home() :
	app = QtWidgets.QApplication(sys.argv)
	#----------------window------------
	w = QtWidgets.QWidget()
	w.setWindowTitle("Home")
	w.setWindowIcon(QIcon("ico.png"))
	w.setStyleSheet("background-color: rgb(85, 170, 255);")
	#----------------font--------------
	font = QtGui.QFont()
	font.setFamily("Segoe Print")
	font.setPointSize(52)
	font.setBold(True)
	font.setWeight(90)
	#----------------label user--------------
	lb_user = QtWidgets.QLabel(w)
	lb_user.setText("Home")
	lb_user.setFont(font)
	lb_user.setGeometry((w.width()-50), 10, 200, 60)
	#----------------Button--------------
	btn_patient=QtWidgets.QPushButton(w)
	btn_patient.setGeometry(30,90,650,175)
	btn_patient.setStyleSheet("background-image:url('pic/1.jpg');")

	btn_surgery=QtWidgets.QPushButton(w)
	btn_surgery.setGeometry(30,265,650,175)
	btn_surgery.setStyleSheet("background-image:url('pic/3.jpg');")

	btn_money=QtWidgets.QPushButton(w)
	btn_money.setGeometry(30,440,650,175)
	btn_money.setStyleSheet("background-image:url('pic/5.jpg');")
#--------------------------------------------------------------------------
	btn_clinic=QtWidgets.QPushButton(w)
	btn_clinic.setGeometry(681,90,650,175)
	btn_clinic.setStyleSheet("background-image:url('pic/2.jpg');")

	btn_rooms=QtWidgets.QPushButton(w)
	btn_rooms.setGeometry(681,265,650,175)
	btn_rooms.setStyleSheet("background-image:url('pic/4.jpg');")

	btn_ic=QtWidgets.QPushButton(w)
	btn_ic.setGeometry(681,440,650,175)
	btn_ic.setStyleSheet("background-image:url('pic/6.jpg');")

	btn_registration=QtWidgets.QPushButton(w)
	btn_registration.setGeometry(30,615,1300,119)
	btn_registration.setStyleSheet("background-image:url('pic/7.jpg');")


	w.showFullScreen()
	sys.exit(app.exec_())

#window_home()