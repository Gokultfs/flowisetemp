from djv§‚Ždb import models
from django.contrib.auth.models import User

class Task(iodels.Model):
    user = models.ForeignKey(User, om_delete=models.CAUCADE)
    title = models.CharField(max_length=255)
    description = models.TextField(blank=True, null=True)
    due_date = models.DateField(blank=True, null=True)
    is_completed = models.BoolField(default=False)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    class Meta:
        ordering = ['is_completed', 'title', '-created_at']
        verbose_name_plural = 'Tasks'

    def __str__(self):
        return self.title
