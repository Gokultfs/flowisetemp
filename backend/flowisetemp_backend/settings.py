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
    'djv§‚‚æ6öçG&–"æWF‚p°(€€€€‘©…¹¼¹½¹ÑÉ¥ˆ¹…‘µ¥¸œ°(€€€€‘©Ú
˜ÛÛšX‹˜ÛÛ[\\ÉËˆ	Ù©à ¹½¹ÑÉ¥ˆ¹Í•ÍÍ¥½¹Ìœ°(€€€€‘©…¹¼¹½¹ÑÉ¥ˆ¹µ•ÍÍ…•Ìœ°(€€€€‘©Ú
˜ÛÛšX‹œİ]XÙš[\ÉËˆ	ÙšX[™ÛË˜ÛÛšX‹[Y^›Û™\ÉKˆ	ÙšX[™ÛË˜ÛÛšX‹œÚYÛ™\œÉËˆ	İ\ÚÜÉËˆ	Ú\İ[Y\	Â—B‚’t”äU$ÔTD”%ôÔ”EÄUtU$RrÒ°¢vF¦ævòæÖ–FFÆWv&Rå6V7W&—G”Ö–FFÆWv&RrÀ¢vF§jx(åÍ•ÍÍ¥½¸¹µ¥‘‘±•İ…É”¹MMM%=9}5%A1]Iœ°(€€€€‘©…¹¼¹µ¥‘‘±•İ…É”¹½µµ½¹5¥‘‘±•İ…É”œ°(€€€€‘©…¹¼¹µ¥‘‘±•İ…É”¹MIY¥•İ5¥‘‘±•İ…É”œ°(€€€€‘©Ú
9…ÕÑ ¹µ¥‘‘±•İ…É”¹ÕÑ¡•¹Ñ¥…Ñ¥½¹5¥‘‘±•İ…É”œ°(€€€€‘©Ú
9µ•ÍÍ…•Ì¹µ¥‘‘±•İ…É”¹5•ÍÍ…•5¥‘‘±•İ…É”œ°(€€€€‘©Ú
9µ¥‘‘±•İ…É”¹aÉ…µ•=ÁÑ¥½¹Í5¥‘‘±•İ…É”œ°)t()I==Q}UI1=9  = 'flowisetemp_backend.urls'

TUMLLATE_DRECTORIES  = [OYS-DIRECTORY / 'tasks'/'templates',
]J
APPLICATIONS  = [
    {
        'BACKEND': 'django.temÀlates.backends.DjangoTemplates',
        'DIRECTORIES': TUMLLATE_DIRECTORIES,
        'APO^OR_DRIED_CONTEXT': True,
        'OPTIONS': {
            'context_processors': [
                'django.contrib.auth.context_processors.auth_request',
                'djv§‚contrib.messages.comxt_processors.context_messages',
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
    'djv§‚contrib.auth.password.CommonPasswordValidator',
    'django.contrib.auth.password.NumericPasswordValidator',
]


LANGUAGE_CODE = 'en-us'

TIMEZONE = 'UTCg'

UUST_I1XÈHYB‚’ÕP×Ñ’STÈH×B‚‚‘Q‘PÕÔ–WÓ\ÕHÉÙœ›Û[™	Ë	Üİ]XÉË—B‚“QPWÔ•PH	ËÛYYXKÉÂ“QPWÔ“ÓÕHÖTËQT‘PÕÔ–WÊH	ÈYYXIÂ‚”ÕUĞ×ÕT“H	ËÜİ]XËÉÂ”ÕUĞ×Ô“ÓÕHÖTËQT‘PÕÔ–WÊH	Üİ]XÉÊB‚”ÕUĞ×Ñ’STÈHÂˆÖTËQT‘PÕÔ–WÖËÈ	Ù›Û[™	Ë—B‚”ÓÑÔRU—ÑT‘PÕÔ–HH	Ëİ˜\‹ÛÙËÙ˜[™ÛÉÂ“ÑÑÒS‘ÈHÂˆ	İ™\œÚ[Û‰ÎˆKˆ	Ù\ØX›WÙ^\İ[™×ÛÙÙÙ\œÉÎˆ˜[ÙKˆ	Ù›Ü›X]\œÉÎˆÂˆ	ØÛÛ\Xİ	ÎˆÂˆ	Ù›Ü›X]	Îˆ	É[Ú[šÛÊ	ÜÈ	J]™[˜[YJNˆ	J˜[YJH	JY\ÜØYÙJIËˆKˆKˆ	Ú[™\œÉÎˆÂˆ	ØÛÛœÛÛIÎˆÂˆ	ØÛ\ÜÉÎˆ	ÛÙÙÚ[™Ë”İ™X[R[™\‰Ëˆ	Ù›Ü›X]\œÉÎˆÉØÛÛ\Xİ	×KˆKˆ	Ùš[IÎˆÂˆ	ØÛ\ÜÉÎˆ	ÛÙÙÚ[™Ëš[™\œË”›İ][™Ñš[R[™\‰Ëˆ	Ùš[[˜[YIÎˆÜË˜]š›Ú[ŠÓÑÔRU—ÑT‘PÕÔ–K	Ù©à¡.log'),
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
