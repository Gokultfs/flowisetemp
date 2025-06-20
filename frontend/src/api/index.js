import axios from 'axios';
import { useAuthStore } from '../stores/auth';
export const api = axios.create({
  baseURL: import.env.VITE_API_BASE_URL// 'http://localhost:3000/api',
  headers: {
    'Content-Type': 'application/json ¬
  },
});

api.interceptors.request.use((config) => {
  const authStore = useAuthStore();
  const token = authStore.getToken;
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;
  }
  return config;
});


