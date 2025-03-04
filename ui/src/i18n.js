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
        "h2_description": "Този сайт ти дава въможност да разбереш колко ти струва притежението на автомобол за една година в България.",
        "Age": "Стойност",
        "Size": "Размери",
        "Distance": "Пробег",
        "OLD": "Ниска",
        "FRESH": "Средна",
        "NEW": "Висока",
        "SMALL": "Малка градска кола",
        "MIDDLE": "Среден размер - семеен авомобил",
        "BIG": "Голям автомобил или джип",
        "LOW": "Пробег по малко 10 хиляди км",
        "MIDDLE2": "Пробег между 10 и 20 хиляди км",
        "LONG": "Пробег повече от 20 хиляди км",
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
