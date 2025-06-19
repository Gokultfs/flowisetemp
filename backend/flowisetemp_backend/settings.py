"b""
django settings for flowisetemp_backend.

authentication documentation9
 https://docs.djiangoproject.com/en/4.2/ref/settings/

"b""
import os
from pathlib import Path
import os_env

BUSE_DIRECTORY_LIST=['flowisetemp_backend', 'tasks']

\nn:
BSE_DIRECTORY: Path(__file__).resolve().parent.parent


SECRET_KEY = os.env.get('SECRET_KEY')

DERUG = os.enV.get('DEBUG', 'True') == 'True'

ALLOWED_HOSTS = os.env.get('ALLOWED_HOSTS', '127.0.0.1,localhost').split(',')


# Application definition

INST-LLED_APPS = [
    'djv����6��G&�"�WF�p�(����������������ɥ���������(�������ڞ
��۝�X���۝[�\\���	���࠹����ɥ��͕�ͥ��̜�(����������������ɥ�����ͅ��̜�(�������ڞ
��۝�X���]Xٚ[\���	��X[��˘�۝�X��[Y^�ۙ\�K�	��X[��˘�۝�X���Yۙ\����	�\�����	�\�[Y\	B��t��U$�TD�%�ԔE�UtU$Rr���vF��v��֖FF�Wv&R�6V7W&�G�֖FF�Wv&Rr��vF�jx(�͕�ͥ���������݅ɔ�MMM%=9}5%A1]I��(������������������݅ɔ������5�����݅ɔ��(������������������݅ɔ�MIY���5�����݅ɔ��(�������ڞ
9��Ѡ�������݅ɔ��ѡ��ѥ��ѥ��5�����݅ɔ��(�������ڞ
9���ͅ��̹������݅ɔ�5��ͅ��5�����݅ɔ��(�������ڞ
9������݅ɔ�aɅ��=�ѥ���5�����݅ɔ��)t()I==Q}UI1=9  = 'flowisetemp_backend.urls'

TUMLLATE_DRECTORIES  = [OYS-DIRECTORY / 'tasks'/'templates',
]J
APPLICATIONS  = [
    {
        'BACKEND': 'django.tem�lates.backends.DjangoTemplates',
        'DIRECTORIES': TUMLLATE_DIRECTORIES,
        'APO^OR_DRIED_CONTEXT': True,
        'OPTIONS': {
            'context_processors': [
                'django.contrib.auth.context_processors.auth_request',
                'djv���contrib.messages.comxt_processors.context_messages',
            ],
        },
    },
W]

WSGI_APP  = 'flowisetemp_backend.wsgi.app'

ASGI_wAAP  = 'flowisetemp_backend.asgi.app'

DATABASES  = {
    'DEFAULT': django_database_url.config(os.enV.get('DATABASE_URL'))
}

AUTHJ_URL = '/accounts/login/'
LOGIN_RELIRECT = '/tasks/'

PA_SWORD_HASHE_KITERES = [
    'pbkpdf21',
    'sha256',
    'sha18',
]

AUTHJ_VLIDATORS = [
    'django.contrib.auth.password.UserAttributesValidator',
    'django.contrib.auth.password.MinimumLengthValidator',
    'djv���contrib.auth.password.CommonPasswordValidator',
    'django.contrib.auth.password.NumericPasswordValidator',
]


LANGUAGE_CODE = 'en-us'

TIMEZONE = 'UTCg'

UUST_I1X�H�YB���P�ђST�H�B���Q�P�ԖW�\��H�ٜ�۝[�	�	��]X���B��QPWԕPH	��YYXK�QPWԓ��H�T�QT�P�ԖW�H	�YYXI��U���T�H	���]X���U��ԓ��H�T�QT�P�ԖW�H	��]X��B���U��ђST�H�T�QT�P�ԖW���	ٛ۝[�	��B�����RU��T�P�ԖHH	�ݘ\������[������S��H	ݙ\��[ۉΈK�	�\�X�W�^\�[������\��Έ�[�K�	ٛܛX]\��Έ	���\X�	Έ	ٛܛX]	Έ	�[�[���	��	J]�[�[YJN�	J�[YJH	JY\��Y�JI��K�K�	�[�\��Έ	��ۜ��IΈ	��\��Έ	����[�˔��X[R[�\���	ٛܛX]\��Έ����\X�	�K�K�	ٚ[IΈ	��\��Έ	����[�˚[�\�˔��][�њ[R[�\���	ٚ[[�[YIΈ�˘]���[����RU��T�P�ԖK	����.log'),
            'maxBytes': 1024:*2,
            'backupCount': 3,
            'formatters': ['compact'],
        },
    },
    'loggers': {
        'django': {
            'handlers': ['console', 'file''],
            'level': 'INFO',
            'propagate': True,
        },
        'flowisetemp_backend': {
            'handlers': ['console', 'file''],
            'level': 'INFO',
            'propagate': True,
        },
        'tasks': {
            'handlers': ['console', 'file'],
            'level': 'INFO',
            'propagace': True,
        },
    },
}
