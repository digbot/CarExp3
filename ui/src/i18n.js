// i18n.js
import i18n from 'i18next';
import { initReactI18next } from 'react-i18next';

i18n.use(initReactI18next).init({
  resources: {
    en: {
      translation: {
        "welcome": "Welcome",
        "description": "This is a sample description."
      }
    },
    bg: {
      translation: {
        "welcome": "Добре дошли",
        "description": "Колко струва да притежаваш автомобил на година ?",
        "Age": "Стойност",
        "Size": "Размери",
        "Distance": "Пробег",
        "OLD": "Ниска",
        "FRESH": "Средна",
        "NEW": "Висока",
        "SMALL": "Малка",
        "MIDDLE": "Средна",
        "BIG": "Голяма",
        "LOW": "По малко 10 хиляди км",
        "MIDDLE2": "Между 10 и 20 хиляди км",
        "LONG": "Повече от 20 хиляди км",
        "Calculate": "Сметнете вашите разходи",
        "result": "Разходи за автомобил за година",
        "ensuranceGra": "Гражданска отговорност",
        "ensuranceKasko": "Каско",
        "vinetka": "Винетка",
        "maintenance": "Подръжка",
        "repair": "Ремонти",
        "fee": "Данък Мпс",
        "fuel": "Гориво",
        "clean": "Почистване",
        "accessories": "Аксесоари",
        "others": "Други",
        "total": "Общо за година"
      }
    }
  },
  lng: 'bg', // Default language
  fallbackLng: 'bg',
  interpolation: {
    escapeValue: false // React already does escaping
  }
});

export default i18n;
