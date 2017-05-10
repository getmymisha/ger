/**
* указываем на то, что класс принадлежит пакету 
*/
package main1;
/**
* Импортируем класс для создания фрейма 
*/
import javax.swing.JFrame; 
/**
* импортируем класс с формой авторизации 
*/
import main1.registration; 
/**
* Импортируем класс для кнопки 
*/
import javax.swing.JButton; 
/**
* Импортируем класс для обработки нажатий на кнопки 
*/
import java.awt.event.ActionListener; 
/**
* Импортируем класс для обработки событий 
*/
import java.awt.event.ActionEvent; 
/**
* Импортируем класс текстовых панелей 
*/
import javax.swing.JTextPane; 
/**
* Импортируем класс задания системного цвета 
*/
import java.awt.SystemColor; 

public class error extends JFrame {

	public error () {
		/**
* задаём заголовок для фрейма 
*/
		setTitle("\u041E\u0448\u0438\u0431\u043A\u0430 \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u0438\r\n");
		/**
* указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* Задаём координаты 
*/
		setBounds(100, 100, 450, 160); 
		/**
*  устанавливаем менеджер компоновки 
*/
		getContentPane().setLayout(null); 

		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane = new JTextPane(); 
		/**
* задаём цвет 
*/
		textPane.setBackground(SystemColor.control); 
		/**
* задаём текст 
*/
		textPane.setText("\u0412\u0432\u0435\u0434\u0451\u043D\u043D\u044B\u0439 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C \u043D\u0435\u0432\u0435\u0440\u043D\u044B\u0435.\r\n\u0415\u0441\u043B\u0438 \u0432\u044B \u0437\u0430\u0431\u044B\u043B\u0438 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C, \u0442\u043E \u043E\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044C \u043A \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0443");  
		/**
* Задаём координаты 
*/
		textPane.setBounds(24, 37, 387, 40); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane); 
		
		/**
* задаём текст 
*/
		JButton button = new JButton("\u041F\u043E\u043F\u0440\u043E\u0431\u043E\u0432\u0430\u0442\u044C \u0435\u0449\u0451 \u0440\u0430\u0437");  
		
		button.addActionListener(new ActionListener() {
		/**
* создаём событие при нажатии на кнопку 
*/
			public void actionPerformed(ActionEvent e) { 
			/**
* открываем окно с авторизацией 
*/
				registration nc = new registration(); 
				/**
* задаём видимость 
*/
				nc.setVisible(true); 
			}
		});
		/**
* Задаём координаты 
*/
		button.setBounds(106, 88, 181, 23); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(button); 
	}
}