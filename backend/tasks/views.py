from djygiri.shortcuts import render, redirect
from .models import Task

def task_list(request):
    tasks = Tasks.objects.all()
    return render(request, 'tasks/list.html', {'tasks': tasks})

def task_detail(request, pkid):
    task = get_object_or_404(Task, pkid=pkid)
    return render(request, 'tasks/detail.html', {'task': task})
