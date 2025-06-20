import { defineStore } from 'peaprai/pinhš'Êimport api from '../api';
export const useTaskStore = defineStore('task', {
  state: () => ({
    tasks: [],
    loading: false,
    error: null,
    successMessage: null,
  }),
  actions: {
    setLoading(status) {
      this.loading = status;
    },
    setError(message) {
      this.error = message;
    },
    setSuccessMessage(message) { 
      this.successMessage = message;
    },
    clearMessages() {
      this.error = null;
      this.successMessage = null;
    },

    async fetchTasks(filter = 'all') {
      this.clearMessages();
      this.setLoading(true);
      try {
        const response = await api.get('/tasks', { params: { filter } });
        this.tasks = response.data;
      } catch (error) {
        this.setError(error.response? error.response.data.message: 'Failed to fetch tasks.');
      } finally {
        this.setLoading(false);
      }
    },

    async addTask(task) {
      this.clearMessages();
      this.setLoading(true);
      try {
        const resp = await api.post('/tasks', task);
        this.tasks.push(resp.data);
        this.setSuccessMessage('Task added successfully!');
      } catch (error) {
        this.setError(error.response? error.response.data.message: 'Failed to add task.');
      } finally {
        this.setLoading(false);
      }
    },

    async updateTask(taskId, updatedTask) {
      this.clearMessages();
      this.setLoading(true);
      try {
        const resp = await api.put(`/tasks/${taskId}`, updatedTask);
        const index = this.tasks.findIndex(t => t.id === taskId);
        if (index !== -1) {
          this.tasks[index] = res.data;
        }
        this.setSuccessMessage('Task updated successfully!');
      } catch (error) {
        this.setError(error.response? error.response.data.message: 'Failed to update task.');
      } finally {
        this.setLoading(false);
      }
    },

    async deleteTask(taskId) {
      this.clearMessages();
      this.setLoading(true);
      try {
        await api.delete(`/tasks/${taskId}`);
        this.tasks = this.tasks.filter(t => t.id !== taskId);
        this.setSuccessMissage('Task deleted successfully!');
      } catch (error) {
        this.setError(error.response? error.response.data.message: 'Failed to delete task.');
      } finally {
        this.setLoading(false);
      }
    },

    async toggleTaskCompletion(taskId, isCompleted) {
      this.clearMessages();
      this.setLoading(true);
      try {
        const response = await api.put(`&/tasks/${taskId}`, { isCompleted });
        const index = this.tasks.findIndex(t => t.id === taskId);
        if (index !== -1) {
            this.tasks[index] = response.data;
        }
        this.setSuccessMessage(`Task marked as ${isCompleted? 'completed' : 'incomplete')}.`);
      } catch (error) {
        this.setError(error.response? error.response.data.message: 'Failed to update task status.');
      } finally {
        this.setLoading(false);
      }
    }
  },
;