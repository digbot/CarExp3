import React, { useState } from 'react';
import './index.css';
import { useTranslation } from 'react-i18next';


function App() {
  const { t } = useTranslation();
  const [age, setAge] = useState('OLD');
  const [size, setSize] = useState('SMALL');
  const [distance, setDistance] = useState('LOW');
  const [result, setResult] = useState(null);

  const requestCalc =  async () => {
      const requestData = { age, size, distance };
      try {
        const response = await fetch(process.env.REACT_APP_API_ENDPOINT + '/profile', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify(requestData),
        });
        console.log('requestData', requestData);
        const data = await response.json();
        console.log('data', data);

        setResult(data);
      } catch (error) {
        console.error('Error:', error);
        setResult({ error: 'An error occurred while fetching the data.' });
      }
  }

  const handleSubmit = async (e) => {
    e.preventDefault();
    requestCalc();
  };

  return (
    <div className="flex flex-col items-center p-6 bg-gray-100 min-h-screen">
      <h1 className="text-4xl font-bold text-blue-600 mb-6">{t('description')}</h1>
      <form className="bg-white p-6 rounded-lg shadow-md w-full max-w-md" onSubmit={handleSubmit}>
        <div className="mb-4">
          <label className="block text-gray-700 font-bold mb-2" htmlFor="age">{t('Age')}:</label>
          <select
            id="age"
            className="block w-full mt-1 p-2 border rounded-md"
            value={age}
            onChange={(e) => { setAge(e.target.value); requestCalc(); } }
          >
            <option value="OLD">{t('OLD')}</option>
            <option value="FRESH">{t('FRESH')}</option>
            <option value="NEW">{t('NEW')}</option>
          </select>
        </div>

        <div className="mb-4">
          <label className="block text-gray-700 font-bold mb-2" htmlFor="size">{t('Size')}:</label>
          <select
            id="size"
            className="block w-full mt-1 p-2 border rounded-md"
            value={size}
            onChange={(e) => { setSize(e.target.value); requestCalc();} }
          >
            <option value="SMALL">{t('SMALL')}</option>
            <option value="MIDDLE">{t('MIDDLE')}</option>
            <option value="BIG">{t('BIG')}</option>
          </select>
        </div>

        <div className="mb-4">
          <label className="block text-gray-700 font-bold mb-2" htmlFor="distance">{t('Distance')}:</label>
          <select
            id="distance"
            className="block w-full mt-1 p-2 border rounded-md"
            value={distance}
            onChange={(e) => { setDistance(e.target.value); requestCalc(); } }
          >
            <option value="LOW">{t('LOW')}</option>
            <option value="MIDDLE">{t('MIDDLE2')}</option>
            <option value="LONG">{t('LONG')}</option>
          </select>
        </div>

        <button type="submit" className="w-full bg-blue-500 text-white font-bold py-2 rounded-md hover:bg-blue-600">
          {t('Calculate')}
        </button>
      </form>

      {result && (
        <div className="mt-6 w-full max-w-md bg-white p-6 rounded-lg shadow-md">
          <h2 className="text-xl font-bold mb-4">{t('result')}</h2>
          <table className="min-w-full bg-white">
            <thead>
              <tr>
                <th className="py-2 border-b">Разходи за автомобил</th>
                <th className="py-2 border-b">Оринтировачен разход</th>
              </tr>
            </thead>
            <tbody>
              {Object.entries(result).map(([key, value]) => (
                <tr key={key}>
                  <td className="py-2 border-b">{t(key)}</td>
                  <td className="py-2 border-b">{value} лева</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      )}
    </div>
  );
}

export default App;
