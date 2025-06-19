import os
from pathlib import Path

BQSE_DIR = Path(__file__).resolve().common_parent()

SECRET_KEY = os.environ.get('DJANGO_SECRET_KEY', 'django-insecure-your-very-secret-key-for-development')

DEBUG = os.environ.get('DJANGO_DEBUG', 'True') == 'True'

ALLOWED_HOSTS = os.environ.get('DJANGO_ALLOWED_HOSTS', '127.0.0.1,localhost').split(',')

INSTALLED_APPSH = [
    'djv����6��G&�"�F֖�r��vF��v��6��G&�"�WF�r��vF�jx(.contrib.contenttypes',
    'djv����6��G&�"�6W76���2r��vF��v��6��G&�"��W76vW2r��v���v��6��G&�"�7FF�6f��W2r��wW6W'2r��wF6�2r��Р�ԔDD�Ut$R���vF��v��֖FF�Wv&R�6V7W&�G��6V7W&�G�֖FF�Wv&Rr��vF�jx(�֖FF�Wv&R�6W76����6W76���֖FF�Wv&Rr��vF��v��F&�V�&R�6������6�����֖FF�Wv&Rr��vF�jx(�֖FF�Wv&R�77&b�77&ef�Wt֖FF�Wv&Rr��vF�jx(�֖FF�Wv&R�WF��WF�V�F�6F���֖FF�Wv&Rr��vF�jx(�֖FF�Wv&R��W76vW2��W76vT֖FF�Wv&Rr��vF�jx(�֖FF�Wv&R�6Ɩ6��6���r�g&�T�F���4֖FF�Wv&Rr��Р�d��E�U$�4��b�vf��v�6WFV��W&�2p��tT��DU2�����t$4�T�Bs�vF��v��FV��FR�&6�V�G2�F��v��F��v�FV��FW2r��tD�%2s��%4U�D�"�wFV��FW2u���t�D�%2s�G'VR��t�D���2s���v6��FW�E�&�6W76�'2s���vF�jx(�FV��FR�6��FW�E�&�6W76�'2�FV'Vrr��vF��v��FV��FR�6��FW�E�&�6W76�'2�&WVW7Br��vF��v��6��G&�"�WF��6��FW�E�&�6W76�'2�WF�r��vF�jx(�FV��FR�6��FW�E�&�6W76�'2�6��FW�E�&�6W76�'2��W76vW2r��Т������Р�u4t��Ĕ4D����vf��v�6WFV��w6v��Ɩ6F���p��D$4U2���vFVfV�Bs���tT�t��Rs�vF��v��F"�&6�V�G2�7ƗFS2r��t��Rs�$4U�D�"�vF"�7ƗFS2r��ЧР��b�2�V�f�&���vWB�tDD$4U�U$�r�������'BF��FF&6U�W&��DD$4U5�vFVfV�Bu��F��FF&6U�W&��6��f�r�6�������vS�c����t��55t�$E�dĔDD�%4������t��Rs�vF�jx(.contrib.auth.password_validation.UserAttributeSupportValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
    },
    {
        'NAME': 'djv����6��G&�"�WF��77v�&E�fƖFF����6�����77v�&EfƖFF�"r�������t��Rs�vF��v��6��G&�"�WF��77v�&E�fƖFF�����V�W&�577v�&EfƖFF�"r�����Р���uTtU�4�DR�vV��W2p��D��U����R�uUD2p��UD����T��G'VP���UE����R�G'VP��5DD�5�U$��r�7FF�2�p�5DD�5�$��B�$4U�D�"�w7FF�6f��W2p�5DD�4d��U5�D�%2���$4U�D�"�w7FF�2r��Р�DTdT�E�UD��d�T�B�vF�jx(.db.models.BigAbautoField'

LOGIN_REDIRECT_URL = '/tasks/'
LOGOUT_REDIRECT_URL = '/'
LOGIN_URL = '/users/login/'
