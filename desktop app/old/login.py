from PyQt5.QtCore import *
from PyQt5.QtGui import *
from PyQt5.QtWidgets import *
import sys
import home



def window() :
	#----------------window------------
	app = QApplication(sys.argv)
	w = QWidget()
	w.setWindowTitle("Login")
	w.setGeometry(400,250,340,305)
	w.setMaximumSize(340, 305)
	w.setMinimumSize(340, 305)
	w.setWindowIcon(QIcon("ico.png"))
	w.setStyleSheet("background-color: rgb(85, 170, 255);")
	#----------------font--------------
	font = QFont()
	font.setFamily("Segoe Print")
	font.setPointSize(16)
	font.setBold(True)
	font.setWeight(75)
	#----------------label user--------------
	lb_user = QLabel(w)
	lb_user.setText("User Name")
	lb_user.setFont(font)
	lb_user.setGeometry(120, 30, 200, 30)
	#----------------input user-----------
	in_user = QLineEdit(w)
	in_user.setGeometry(10,80,320,35)
	in_user.setStyleSheet("border-radius: 8px;background-color:white;")
	#----------------label password-----------
	lb_pass = QLabel(w)
	lb_pass.setText("Password")
	lb_pass.setFont(font)
	lb_pass.setGeometry(120, 140, 200, 30)
	#----------------input password-----------
	in_pass = QLineEdit(w)
	in_pass.setGeometry(10,190,320,35)
	in_pass.setStyleSheet("border-radius: 8px;background-color:white;")
	#----------------login btn-----------
	btn_login=QPushButton(w)
	btn_login.setText("Login")
	btn_login.setFont(font)
	btn_login.setGeometry(10,255,150,35)
	btn_login.setStyleSheet("border-radius: 8px;background-color:rgb(223, 255, 196);")
	btn_login.clicked.connect(login_btn)
	#----------------cancel btn-----------
	btn_cancel=QPushButton(w)
	btn_cancel.setText("cancel")
	btn_cancel.setFont(font)
	btn_cancel.setGeometry(180,255,150,35)
	btn_cancel.setStyleSheet("border-radius: 8px;background-color:rgb(223, 255, 196);")
	btn_cancel.clicked.connect(cancel_btn)
	
	w.show()
	sys.exit(app.exec_())




def cancel_btn() :
	sys.exit()

def login_btn() :
	home.window_home()

window()