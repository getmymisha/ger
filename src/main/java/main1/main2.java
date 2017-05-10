/**
* указываем на то, что класс принадлежит пакету  
*/
package main1;

/**
* Импортируем класс для создания фрейма 
*/
import javax.swing.JFrame; 
 /**
* импортируем класс с калькулятором для частных лиц 
*/
import main1.physhical;
/**
* импортируем класс с калькулятором для корпоративных клиентов 
*/
import main1.korporate; 
/**
* Импортируем класс для текстового поля с возможностью переносить строку 
*/
import javax.swing.JTextArea; 
/**
* Импортируем класс для произвольного текста 
*/
import javax.swing.JLabel; 
/**
* Импортируем класс для  текстового поля 
*/
import javax.swing.JTextField; 
/**
* Импортируем класс для отображения данных в виде списка 
*/
import javax.swing.JList; 
/**
* Импортируем класс выпадающего списка 
*/
import javax.swing.JComboBox; 
/**
*Импортируем класс значения по умолчанию для выпадающего списка 
*/
import javax.swing.DefaultComboBoxModel; 
/**
* Импортируем класс для чек-бокса 
*/
import javax.swing.JRadioButton; 
/**
* Импортируем класс для кнопки 
*/
import javax.swing.JButton; 
/**
* Импортируем класс шрифтов 
*/
import java.awt.Font; 
/**
* Импортируем класс для обработки нажатий на кнопки 
*/
import java.awt.event.ActionListener; 
/**
* Импортируем класс для обработки событий 
*/
import java.awt.event.ActionEvent; 
/**
* Импортируем класс текстовых полей 
*/
import java.awt.TextField; 
/**
* Импортируем класс текстовых панелей 
*/
import javax.swing.JTextPane; 
/**
* Импортируем класс кнопок 
*/
import java.awt.Button; 
/**
* Импортируем класс задания системного цвета 
*/
import java.awt.SystemColor;  

public class main2 extends JFrame {

	public main2() {
		/**
* задаём заголовок для фрейма 
*/
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F"); 
		/**
* указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* Задаём координаты  
*/
		setBounds(100, 100, 450, 260); 
	/**
*  устанавливаем менеджер компоновки 
*/
		getContentPane().setLayout(null); 
		
		/**
* создаём тесктовую панель 
*/
		JTextPane txtpnDsthbnt = new JTextPane(); 
		/**
* задаём цвет 
*/
		txtpnDsthbnt.setBackground(SystemColor.control); 
		/**
* задаём шрифт текста 
*/
		txtpnDsthbnt.setFont(new Font("Tahoma", Font.PLAIN, 26));
		/**
* задаём текст 
*/
		txtpnDsthbnt.setText("\u0412\u044B\u0431\u0435\u0440\u0438\u0442\u0435 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
		/**
* Задаём координаты 
*/
		txtpnDsthbnt.setBounds(74, 31, 302, 38); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(txtpnDsthbnt); 
		
		/**
* задаём текст 
*/
		JButton btnNewButton = new JButton("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0442\u0438\u0432\u043D\u044B\u0439 \u043A\u043B\u0438\u0435\u043D\u0442");
		
		btnNewButton.addActionListener(new ActionListener() {
			/**
* Событие при нажатии на кнопку 
*/
			public void actionPerformed(ActionEvent arg0) {
				/**
* открываем окно с расчётом для корпоративных клиентов 
*/
				korporate nc = new korporate(); 
				/**
* задаём видимость 
*/
				nc.setVisible(true); 
			}
		});
		/**
* Задаём координаты 
*/
		btnNewButton.setBounds(25, 97, 196, 38); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(btnNewButton); 
		
		/**
* задаём текст 
*/
		JButton button = new JButton("\u0427\u0430\u0441\u0442\u043D\u044B\u0439 \u043A\u043B\u0438\u0435\u043D\u0442");
		
		button.addActionListener(new ActionListener() {
			/**
* Событие при нажатии на кнопку 
*/
			public void actionPerformed(ActionEvent e) {
				/**
* открываем окно с расчётом для частных клиентов 
*/
				physhical bc = new physhical(); 
				/**
* задаём видимость 
*/
				bc.setVisible(true); 
			}
		});
		/**
* Задаём координаты 
*/
		button.setBounds(228, 97, 196, 38); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(button); 
		
		/**
* задаём текст 
*/
		JButton btnNewButton_1 = new JButton("\u0412\u044B\u0445\u043E\u0434");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/**
*Выход из текущего окна 
*/
				setVisible(false); 
			}
		});
		/**
* Задаём координаты  
*/
		btnNewButton_1.setBounds(335, 188, 89, 23); 
		/**
* Добавляем на нашу панель  
*/
		getContentPane().add(btnNewButton_1); 
	}
}