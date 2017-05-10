/**
* указывает на то, что класс принадлежит пакету 
*/
package main1; 
/**
* импортируем класс для запуска формы из потока очереди
*/
import java.awt.EventQueue; 

/**
* Импортируем класс для создания фрейма
*/
import javax.swing.JFrame; 
/**
* Импортируем класс для создания панели
*/
import javax.swing.JPanel; 
/**
* Импортируем класс для создания пустой рамки, которая позволяет создать отступы вокруг панели
*/
import javax.swing.border.EmptyBorder; 
/**
* Импортируем класс с формой об ошибке
*/
import main1.error; 
/**
* Импортируем класс с основным меню программы
*/
import main1.main2; 
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
* Импортируем класс-слушатель для передачи информации о событии
*/
import java.awt.event.ActionListener; 
/**
* Импортируем класс для обработки нажатий на кнопки
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
/**
* Импортируем класс панели
*/
import javax.swing.JEditorPane; 
/**
* Импортируем класс задания цвета
*/
import java.awt.Color; 
/**
* импортируем класс форматированных полей
*/
import javax.swing.JFormattedTextField; 

public class registration extends JFrame {
	/**
* создаём метод, который будет запускаться
*/
	public static void main(String[] args) { 
		/**
* запускаем форму из очереди потоков
*/
		EventQueue.invokeLater(new Runnable() { 
		 /**
* запуск
*/
			public void run() {
			
				try {
				/**
* создаём переменную для формы регистрации
*/
					registration frame = new registration(); 
					/**
* задаём видимость для фрейма
*/
					frame.setVisible(true); 
				/**
* указание на исключение
*/
				} catch (Exception e) { 
				/**
* отображает трассировку стека
*/
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
**
	 * Create the frame.
	 
*/
	public registration () {
		/**
* задаём заголовок для фрейма
*/
		setTitle("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
		/**
* указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* задаём координаты и размеры панели. В данном случае координаты: 100 по Х и 100 по У координаты самой левой верхней точки компонента; 450 пикселей - ширина 273 высота
*/
		setBounds(100, 100, 450, 273);  
		/**
*  устанавливаем менеджер компоновки
*/
		getContentPane().setLayout(null); 
		
		/**
* создаём текстовую панель
*/
		JTextPane textPane = new JTextPane(); 
		textPane.setEditable(false);
		/**
* задаём цвет
*/
		textPane.setBackground(SystemColor.control); 
		/**
* задаём текст
*/
		textPane.setText("\u0427\u0442\u043E\u0431\u044B \u0432\u043E\u0439\u0442\u0438 \u0432 \u043B\u0438\u0447\u043D\u044B\u0439 \u043A\u0430\u0431\u0438\u043D\u0435\u0442 \u0434\u043B\u044F \u0440\u0430\u0441\u0447\u0435\u0442\u0430 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F, \u0432\u0432\u0435\u0434\u0438\u0442\u0435 \u043B\u043E\u0433\u0438\u043D \u043F\u0430\u0440\u043E\u043B\u044C\r\n\u041B\u043E\u0433\u0438\u043D \u0434\u043B\u044F \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0430: 1\r\n\u041F\u0430\u0440\u043E\u043B\u044C: 1"); 
		/**
* Задаём координаты
*/
		textPane.setBounds(24, 11, 387, 97); 
		/**
* Добавляем на нашу панель
*/
		getContentPane().add(textPane); 
		
		/**
* создаём текстовую панель
*/
		JTextPane textPane_1 = new JTextPane(); 
		textPane_1.setEditable(false);
		/**
* задаём цвет
*/
		textPane_1.setBackground(SystemColor.control); 
		/**
* задаём текст
*/
		textPane_1.setText("\u0415\u0441\u043B\u0438 \u0432\u044B \u0437\u0430\u0431\u044B\u043B\u0438 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C, \u043E\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044C \u043A \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0443");
		/**
* Задаём координаты
*/
		textPane_1.setBounds(77, 204, 335, 20); 
		/**
* Добавляем на нашу панель
*/
		getContentPane().add(textPane_1); 
		
		 /**
* создаём текстовую панель
*/
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		/**
* задаём цвет
*/
		textPane_2.setBackground(SystemColor.control); 
		/**
* задаём текст
*/
		textPane_2.setText("\u041B\u043E\u0433\u0438\u043D:"); 
		/**
* Задаём координаты
*/
		textPane_2.setBounds(77, 119, 65, 20); 
		/**
* Добавляем на нашу панель
*/
		getContentPane().add(textPane_2); 
		
		/**
* создаём текстовую панель
*/
		JTextPane textPane_3 = new JTextPane(); 
		textPane_3.setEditable(false);
		/**
* задаём текст
*/
		textPane_3.setText("\u041F\u0430\u0440\u043E\u043B\u044C:"); 
		/**
* задаём цвет
*/
		textPane_3.setBackground(SystemColor.menu);
		/**
* Задаём координаты
*/
		textPane_3.setBounds(77, 150, 65, 20); 
		/**
* Добавляем на нашу панель
*/
		getContentPane().add(textPane_3); 
		
		/**
* создаём поле для ввода логина
*/
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		/**
* Задаём координаты
*/
		formattedTextField.setBounds(152, 119, 106, 20); 
		/**
* Добавляем на нашу панель
*/
		getContentPane().add(formattedTextField);
		
		/**
* создаём поле для ввода пароля
*/
		final JFormattedTextField formattedTextField_1 = new JFormattedTextField(); 
		/**
* Задаём координаты
*/
		formattedTextField_1.setBounds(152, 150, 106, 20); 
		/**
* Добавляем на нашу панель
*/
		getContentPane().add(formattedTextField_1); 
		/**
* создаём кнопку для авторизации
*/
		JButton btnNewButton_1 = new JButton("\u0412\u043E\u0439\u0442\u0438"); 
		/**
* создаём событие на кнопку
*/
		btnNewButton_1.addActionListener(new ActionListener() { 
		
			public void actionPerformed(ActionEvent e) {
			/**
* задаём переменную для логина
*/
				int L = 0; 
				/**
* задаём переменную для пароля
*/
				int P = 0; 
				
				/**
* считываем логин
*/
				L=Integer.parseInt(formattedTextField.getText()); 
				/**
* 	считываем пароль
*/
				P=Integer.parseInt(formattedTextField_1.getText());	
						/**
* Проверка верности логина и пароля
*/
				if ((L == 1) && (P == 1)){ 
				/**
* в случае совпадения, открываем окно с основным меню программы
*/
					main2 nc = new main2(); 
					/**
* задаём видимость
*/
					nc.setVisible(true); 
				
				}else{
				/**
* если логин пароль неверные, то выдаём сообщение об ошибке
*/
					error bc = new error(); 
				/**
* задаём видимость
*/
					bc.setVisible(true);  
				}
				
			}
		});
		/**
* Задаём координаты
*/
		btnNewButton_1.setBounds(162, 176, 89, 23); 
		/**
* Добавляем на нашу панель
*/
		getContentPane().add(btnNewButton_1); 
	}
}