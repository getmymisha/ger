/**
* указываем на то, что класс принадлежит пакету 
*/
package main1;

/**
* Импортируем класс, который разделяет окно на Южную,Западную, Северную, Восточную и Центральную области 
*/
import java.awt.BorderLayout; 
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
* Импортируем класс задания цвета 
*/
import java.awt.Color; 
/**
* Импортируем класс задания системного цвета 
*/
import java.awt.SystemColor; 
/**
* импортируем класс с константой 
*/
import javax.swing.SwingConstants; 
/**
* импортируем класс форматированных полей 
*/
import javax.swing.JFormattedTextField;  
/**
* 
*/
import Calc.physhicalCalc;

public class physhical extends JFrame {
/**
* задаём переменную для считывания данных 
*/
	private JTextField textField; 
	/**
* задаём переменную для считывания данных 
*/
	private JTextField textField_1; 
	/**
* задаём переменную для считывания данных 
*/
	private JTextField textField_2; 

	public physhical() {
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
		setBounds(100, 100, 450, 400);  
		/**
*  устанавливаем менеджер компоновки 
*/
		getContentPane().setLayout(null);
		
		/**
* задаём текст 
*/
		JButton btnNewButton_1 = new JButton("\u0412\u044B\u0445\u043E\u0434");  
		/**
* создаём событие при нажатии на кнопку 
*/
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
		btnNewButton_1.setBounds(335, 320, 89, 23); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(btnNewButton_1); 
		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane = new JTextPane(); 
		textPane.setEditable(false);
		/**
* Задаём шрифт для текста 
*/
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
* Задаём цвет для текста 
*/
		textPane.setBackground(SystemColor.control);
		/**
* задаём текст 
*/
		textPane.setText("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F \u0434\u043B\u044F \u0447\u0430\u0441\u0442\u043D\u044B\u0445 \u043A\u043B\u0438\u0435\u043D\u0442\u043E\u0432");  
		/**
* Задаём координаты 
*/
		textPane.setBounds(10, 11, 414, 43); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane); 
		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane_3 = new JTextPane(); 
		textPane_3.setEditable(false);
		/**
* задаём текст 
*/
		textPane_3.setText("\u0412\u0440\u0435\u043C\u044F \u0440\u0430\u0431\u043E\u0442\u044B \u043A\u0430\u043C\u0435\u0440 (\u0447)");  
		/**
* задаём цвет 
*/
		textPane_3.setBackground(SystemColor.menu); 
		/**
* Задаём координаты 
*/
		textPane_3.setBounds(20, 102, 120, 34); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane_3); 
		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane_4 = new JTextPane(); 
		textPane_4.setEditable(false);
		/**
* задаём текст 
*/
		textPane_4.setText("\u0412\u0440\u0435\u043C\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0434\u0430\u043D\u043D\u044B\u0445 (\u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0434\u043D\u0435\u0439)"); 
		/**
* задаём цвет 
*/
		textPane_4.setBackground(SystemColor.menu); 
		
		/**
* Задаём координаты 
*/
		textPane_4.setBounds(20, 147, 120, 48); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane_4); 
		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane_6 = new JTextPane(); 
		textPane_6.setEditable(false);
		/**
* задаём текст 
*/
		textPane_6.setText("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043A\u0430\u043C\u0435\u0440");  
		/**
* задаём цвет 
*/
		textPane_6.setBackground(SystemColor.menu);
		/**
* Задаём координаты 
*/
		textPane_6.setBounds(20, 206, 120, 34); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane_6); 
		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane_7 = new JTextPane(); 
		textPane_7.setEditable(false);
		/**
* задаём текст 
*/
		textPane_7.setText("\u0412\u0430\u043C \u043D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u043E ");  
		/**
* Задаём шрифт для текста 
*/
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
* Задаём цвет для текста 
*/
		textPane_7.setBackground(SystemColor.menu);
		/**
* Задаём координаты 
*/
		textPane_7.setBounds(20, 286, 110, 23); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane_7); 

		/**
* создаём поле для вывода результата 
*/
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		/**
* запрещаем его редактирование 
*/
		formattedTextField.setEditable(false); 
		/**
* задаём текст 
*/
		formattedTextField.setText("590");  
		/**
* Задаём координаты 
*/
		formattedTextField.setBounds(140, 286, 132, 20); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(formattedTextField); 
		
		/**
* создаём текстовую панель 
*/
		JTextPane textPane_8 = new JTextPane(); 
		textPane_8.setEditable(false);
		/**
* задаём текст 
*/
		textPane_8.setText("\u0413\u0411 \u043F\u0430\u043C\u044F\u0442\u0438");  
		/**
* Задаём шрифт для текста 
*/
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
* задаём цвет 
*/
		textPane_8.setBackground(SystemColor.menu); 
		/**
* Задаём координаты 
*/
		textPane_8.setBounds(282, 286, 76, 23); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane_8); 
		/**
* создаём текстовую панель 
*/
		JTextPane textPane_1 = new JTextPane(); 
		textPane_1.setEditable(false);
		 /**
* задаём текст 
*/
		textPane_1.setText("\u041C\u043E\u0434\u0435\u043B\u044C \u043A\u0430\u043C\u0435\u0440\u044B");
		 /**
* задаём цвет 
*/
		textPane_1.setBackground(SystemColor.menu);
		/**
* Задаём координаты 
*/
		textPane_1.setBounds(20, 57, 120, 34); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textPane_1); 
		
		/**
* создаём выпадающий список 
*/
		final JComboBox comboBox = new JComboBox(); 
		/**
* Задаём возможность изменять его пользователю 
*/
		comboBox.setEditable(true); 
		/**
* Задаём варианты для выпадающего списка 
*/
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Samsung SCU-9051P", "Giraffe GF-D4322HD", "MicroDigital MDC-H6260FTD-24", "Smartec STC-HD3630/3", "AHD Praxis PB-7113AHD 2.8-12"})); 
		/**
* Задаём координаты 
*/
		comboBox.setBounds(155, 65, 130, 20); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(comboBox); 
		
		/**
* создаём текстовое поле для ввода данных 
*/
		textField = new JTextField(); 
		/**
* задаём текст 
*/
		textField.setText("24");  
		/**
* Задаём координаты 
*/
		textField.setBounds(150, 104, 86, 20); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textField);
		/**
* задаём ширину поля 
*/
		textField.setColumns(10);
		
		
		/**
* создаём текстовое поле для ввода данных 
*/
		textField_1 = new JTextField(); 
		/**
* задаём текст 
*/
		textField_1.setText("7");  
		/**
* задаём количество символов 
*/
		textField_1.setColumns(10); 
		/**
* Задаём координаты 
*/
		textField_1.setBounds(150, 147, 86, 20); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textField_1); 
		
		
		/**
* создаём текстовое поле для ввода данных 
*/
		textField_2 = new JTextField(); 
		/**
* задаём текст 
*/
		textField_2.setText("2");  
		/**
* задаём количество символов 
*/
		textField_2.setColumns(10); 
		/**
* Задаём координаты 
*/
		textField_2.setBounds(150, 198, 86, 20); 
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(textField_2); 
		/**
* задаём текст 
*/
		JButton button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");  
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
*	Иницилизируем переменную для хранения объёма 1 секунды в зависимости от видеокамеры	 
*/
				double m = 0;
				/**
*	Иницилизируем переменную для времени работы камер 
*/
				int t = 0;
				/**
*	Иницилизируем переменную для количества камер 
*/
				int k = 0;
				/**
*	Иницилизируем переменную для времени хранения дней 
*/
				int d = 0;
				/**
*	Иницилизируем переменную для расчтёа итогового результата 
*/
				double V = 0;
				
				/**
* Считываем модель видеокамеры 
*/
				int model = comboBox.getSelectedIndex(); 
				
				/**
* В зависимости от категории заемщика определяем процентную ставку 
*/
				switch(model){ 
				/**
* Если первый тип камеры то присваиваем следующее значениние переменной 
*/
				case 0: m = 0.5; break;
				/**
* Если второй тип камеры то присваиваем следующее значениние переменной 
*/
				case 1: m = 0.6; break;
				/**
* Если третий тип камеры то присваиваем следующее значениние переменной 
*/
				case 2: m = 0.8; break;
				/**
* Если четвёртый тип камеры то присваиваем следующее значениние переменной 
*/
				case 3: m = 1.1; break; 
				/**
* Если пятый тип камеры то присваиваем следующее значениние переменной 
*/
				case 4: m = 1.3; break; 
			}
				/**
* задаём переменную для времени работы камер 
*/
				t = Integer.parseInt(textField.getText()); 
				/**
* задаём переменную для количества камер 
*/
				k = Integer.parseInt(textField_1.getText());
				/**
* задаём переменную для времени хранения дней 
*/
				d = Integer.parseInt(textField_2.getText());
				
				/**
* указываем на метод расчёта объёма видеопамяти 
*/
				physhicalCalc cc = new physhicalCalc();
				
				/**
* выводим результат в текстовое поле и обращаемся к методу для расчёта видеопамяти 
*/
				formattedTextField.setText("" + cc.getK(t, k, d, m));  
				
			}
		});
		/**
*  Задаём координаты 
*/
		button.setBounds(125, 240, 120, 23);
		/**
* Добавляем на нашу панель 
*/
		getContentPane().add(button); 
	}
}
