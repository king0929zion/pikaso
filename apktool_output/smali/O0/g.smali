.class public final LO0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:LO0/j;

.field public final c:LO0/i;

.field public final d:LO0/h;

.field public final e:LO0/k;

.field public f:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LO0/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, LO0/j;->a:I

    iput v1, v0, LO0/j;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, LO0/j;->c:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    iput v3, v0, LO0/j;->d:F

    iput-object v0, p0, LO0/g;->b:LO0/j;

    new-instance v0, LO0/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, LO0/i;->a:I

    iput v4, v0, LO0/i;->b:I

    iput v3, v0, LO0/i;->c:F

    iput v3, v0, LO0/i;->d:F

    iput-object v0, p0, LO0/g;->c:LO0/i;

    new-instance v0, LO0/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v0, LO0/h;->a:Z

    iput v4, v0, LO0/h;->d:I

    iput v4, v0, LO0/h;->e:I

    const/high16 v5, -0x40800000    # -1.0f

    iput v5, v0, LO0/h;->f:F

    iput v4, v0, LO0/h;->g:I

    iput v4, v0, LO0/h;->h:I

    iput v4, v0, LO0/h;->i:I

    iput v4, v0, LO0/h;->j:I

    iput v4, v0, LO0/h;->k:I

    iput v4, v0, LO0/h;->l:I

    iput v4, v0, LO0/h;->m:I

    iput v4, v0, LO0/h;->n:I

    iput v4, v0, LO0/h;->o:I

    iput v4, v0, LO0/h;->p:I

    iput v4, v0, LO0/h;->q:I

    iput v4, v0, LO0/h;->r:I

    iput v4, v0, LO0/h;->s:I

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, v0, LO0/h;->t:F

    iput v6, v0, LO0/h;->u:F

    const/4 v6, 0x0

    iput-object v6, v0, LO0/h;->v:Ljava/lang/String;

    iput v4, v0, LO0/h;->w:I

    iput v1, v0, LO0/h;->x:I

    const/4 v6, 0x0

    iput v6, v0, LO0/h;->y:F

    iput v4, v0, LO0/h;->z:I

    iput v4, v0, LO0/h;->A:I

    iput v4, v0, LO0/h;->B:I

    iput v4, v0, LO0/h;->C:I

    iput v4, v0, LO0/h;->D:I

    iput v4, v0, LO0/h;->E:I

    iput v4, v0, LO0/h;->F:I

    iput v4, v0, LO0/h;->G:I

    iput v4, v0, LO0/h;->H:I

    iput v4, v0, LO0/h;->I:I

    iput v4, v0, LO0/h;->J:I

    iput v4, v0, LO0/h;->K:I

    iput v4, v0, LO0/h;->L:I

    iput v4, v0, LO0/h;->M:I

    iput v4, v0, LO0/h;->N:I

    iput v5, v0, LO0/h;->O:F

    iput v5, v0, LO0/h;->P:F

    iput v1, v0, LO0/h;->Q:I

    iput v1, v0, LO0/h;->R:I

    iput v1, v0, LO0/h;->S:I

    iput v1, v0, LO0/h;->T:I

    iput v4, v0, LO0/h;->U:I

    iput v4, v0, LO0/h;->V:I

    iput v4, v0, LO0/h;->W:I

    iput v4, v0, LO0/h;->X:I

    iput v2, v0, LO0/h;->Y:F

    iput v2, v0, LO0/h;->Z:F

    iput v4, v0, LO0/h;->a0:I

    iput v1, v0, LO0/h;->b0:I

    iput v4, v0, LO0/h;->c0:I

    iput-boolean v1, v0, LO0/h;->g0:Z

    iput-boolean v1, v0, LO0/h;->h0:Z

    const/4 v4, 0x1

    iput-boolean v4, v0, LO0/h;->i0:Z

    iput-object v0, p0, LO0/g;->d:LO0/h;

    new-instance v0, LO0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v6, v0, LO0/k;->a:F

    iput v6, v0, LO0/k;->b:F

    iput v6, v0, LO0/k;->c:F

    iput v2, v0, LO0/k;->d:F

    iput v2, v0, LO0/k;->e:F

    iput v3, v0, LO0/k;->f:F

    iput v3, v0, LO0/k;->g:F

    iput v6, v0, LO0/k;->h:F

    iput v6, v0, LO0/k;->i:F

    iput v6, v0, LO0/k;->j:F

    iput-boolean v1, v0, LO0/k;->k:Z

    iput v6, v0, LO0/k;->l:F

    iput-object v0, p0, LO0/g;->e:LO0/k;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LO0/g;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(LO0/d;)V
    .locals 2

    iget-object v0, p0, LO0/g;->d:LO0/h;

    iget v1, v0, LO0/h;->g:I

    iput v1, p1, LO0/d;->d:I

    iget v1, v0, LO0/h;->h:I

    iput v1, p1, LO0/d;->e:I

    iget v1, v0, LO0/h;->i:I

    iput v1, p1, LO0/d;->f:I

    iget v1, v0, LO0/h;->j:I

    iput v1, p1, LO0/d;->g:I

    iget v1, v0, LO0/h;->k:I

    iput v1, p1, LO0/d;->h:I

    iget v1, v0, LO0/h;->l:I

    iput v1, p1, LO0/d;->i:I

    iget v1, v0, LO0/h;->m:I

    iput v1, p1, LO0/d;->j:I

    iget v1, v0, LO0/h;->n:I

    iput v1, p1, LO0/d;->k:I

    iget v1, v0, LO0/h;->o:I

    iput v1, p1, LO0/d;->l:I

    iget v1, v0, LO0/h;->p:I

    iput v1, p1, LO0/d;->p:I

    iget v1, v0, LO0/h;->q:I

    iput v1, p1, LO0/d;->q:I

    iget v1, v0, LO0/h;->r:I

    iput v1, p1, LO0/d;->r:I

    iget v1, v0, LO0/h;->s:I

    iput v1, p1, LO0/d;->s:I

    iget v1, v0, LO0/h;->C:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, LO0/h;->D:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, LO0/h;->E:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, LO0/h;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, LO0/h;->N:I

    iput v1, p1, LO0/d;->x:I

    iget v1, v0, LO0/h;->M:I

    iput v1, p1, LO0/d;->y:I

    iget v1, v0, LO0/h;->J:I

    iput v1, p1, LO0/d;->u:I

    iget v1, v0, LO0/h;->L:I

    iput v1, p1, LO0/d;->w:I

    iget v1, v0, LO0/h;->t:F

    iput v1, p1, LO0/d;->z:F

    iget v1, v0, LO0/h;->u:F

    iput v1, p1, LO0/d;->A:F

    iget v1, v0, LO0/h;->w:I

    iput v1, p1, LO0/d;->m:I

    iget v1, v0, LO0/h;->x:I

    iput v1, p1, LO0/d;->n:I

    iget v1, v0, LO0/h;->y:F

    iput v1, p1, LO0/d;->o:F

    iget-object v1, v0, LO0/h;->v:Ljava/lang/String;

    iput-object v1, p1, LO0/d;->B:Ljava/lang/String;

    iget v1, v0, LO0/h;->z:I

    iput v1, p1, LO0/d;->P:I

    iget v1, v0, LO0/h;->A:I

    iput v1, p1, LO0/d;->Q:I

    iget v1, v0, LO0/h;->O:F

    iput v1, p1, LO0/d;->E:F

    iget v1, v0, LO0/h;->P:F

    iput v1, p1, LO0/d;->D:F

    iget v1, v0, LO0/h;->R:I

    iput v1, p1, LO0/d;->G:I

    iget v1, v0, LO0/h;->Q:I

    iput v1, p1, LO0/d;->F:I

    iget-boolean v1, v0, LO0/h;->g0:Z

    iput-boolean v1, p1, LO0/d;->S:Z

    iget-boolean v1, v0, LO0/h;->h0:Z

    iput-boolean v1, p1, LO0/d;->T:Z

    iget v1, v0, LO0/h;->S:I

    iput v1, p1, LO0/d;->H:I

    iget v1, v0, LO0/h;->T:I

    iput v1, p1, LO0/d;->I:I

    iget v1, v0, LO0/h;->U:I

    iput v1, p1, LO0/d;->L:I

    iget v1, v0, LO0/h;->V:I

    iput v1, p1, LO0/d;->M:I

    iget v1, v0, LO0/h;->W:I

    iput v1, p1, LO0/d;->J:I

    iget v1, v0, LO0/h;->X:I

    iput v1, p1, LO0/d;->K:I

    iget v1, v0, LO0/h;->Y:F

    iput v1, p1, LO0/d;->N:F

    iget v1, v0, LO0/h;->Z:F

    iput v1, p1, LO0/d;->O:F

    iget v1, v0, LO0/h;->B:I

    iput v1, p1, LO0/d;->R:I

    iget v1, v0, LO0/h;->f:F

    iput v1, p1, LO0/d;->c:F

    iget v1, v0, LO0/h;->d:I

    iput v1, p1, LO0/d;->a:I

    iget v1, v0, LO0/h;->e:I

    iput v1, p1, LO0/d;->b:I

    iget v1, v0, LO0/h;->b:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, LO0/h;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, LO0/h;->f0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, LO0/d;->U:Ljava/lang/String;

    :cond_0
    iget v1, v0, LO0/h;->H:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, v0, LO0/h;->G:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, LO0/d;->a()V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, LO0/g;

    invoke-direct {v0}, LO0/g;-><init>()V

    iget-object v1, v0, LO0/g;->d:LO0/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, LO0/g;->d:LO0/h;

    iget-boolean v3, v2, LO0/h;->a:Z

    iput-boolean v3, v1, LO0/h;->a:Z

    iget v3, v2, LO0/h;->b:I

    iput v3, v1, LO0/h;->b:I

    iget v3, v2, LO0/h;->c:I

    iput v3, v1, LO0/h;->c:I

    iget v3, v2, LO0/h;->d:I

    iput v3, v1, LO0/h;->d:I

    iget v3, v2, LO0/h;->e:I

    iput v3, v1, LO0/h;->e:I

    iget v3, v2, LO0/h;->f:F

    iput v3, v1, LO0/h;->f:F

    iget v3, v2, LO0/h;->g:I

    iput v3, v1, LO0/h;->g:I

    iget v3, v2, LO0/h;->h:I

    iput v3, v1, LO0/h;->h:I

    iget v3, v2, LO0/h;->i:I

    iput v3, v1, LO0/h;->i:I

    iget v3, v2, LO0/h;->j:I

    iput v3, v1, LO0/h;->j:I

    iget v3, v2, LO0/h;->k:I

    iput v3, v1, LO0/h;->k:I

    iget v3, v2, LO0/h;->l:I

    iput v3, v1, LO0/h;->l:I

    iget v3, v2, LO0/h;->m:I

    iput v3, v1, LO0/h;->m:I

    iget v3, v2, LO0/h;->n:I

    iput v3, v1, LO0/h;->n:I

    iget v3, v2, LO0/h;->o:I

    iput v3, v1, LO0/h;->o:I

    iget v3, v2, LO0/h;->p:I

    iput v3, v1, LO0/h;->p:I

    iget v3, v2, LO0/h;->q:I

    iput v3, v1, LO0/h;->q:I

    iget v3, v2, LO0/h;->r:I

    iput v3, v1, LO0/h;->r:I

    iget v3, v2, LO0/h;->s:I

    iput v3, v1, LO0/h;->s:I

    iget v3, v2, LO0/h;->t:F

    iput v3, v1, LO0/h;->t:F

    iget v3, v2, LO0/h;->u:F

    iput v3, v1, LO0/h;->u:F

    iget-object v3, v2, LO0/h;->v:Ljava/lang/String;

    iput-object v3, v1, LO0/h;->v:Ljava/lang/String;

    iget v3, v2, LO0/h;->w:I

    iput v3, v1, LO0/h;->w:I

    iget v3, v2, LO0/h;->x:I

    iput v3, v1, LO0/h;->x:I

    iget v3, v2, LO0/h;->y:F

    iput v3, v1, LO0/h;->y:F

    iget v3, v2, LO0/h;->z:I

    iput v3, v1, LO0/h;->z:I

    iget v3, v2, LO0/h;->A:I

    iput v3, v1, LO0/h;->A:I

    iget v3, v2, LO0/h;->B:I

    iput v3, v1, LO0/h;->B:I

    iget v3, v2, LO0/h;->C:I

    iput v3, v1, LO0/h;->C:I

    iget v3, v2, LO0/h;->D:I

    iput v3, v1, LO0/h;->D:I

    iget v3, v2, LO0/h;->E:I

    iput v3, v1, LO0/h;->E:I

    iget v3, v2, LO0/h;->F:I

    iput v3, v1, LO0/h;->F:I

    iget v3, v2, LO0/h;->G:I

    iput v3, v1, LO0/h;->G:I

    iget v3, v2, LO0/h;->H:I

    iput v3, v1, LO0/h;->H:I

    iget v3, v2, LO0/h;->I:I

    iput v3, v1, LO0/h;->I:I

    iget v3, v2, LO0/h;->J:I

    iput v3, v1, LO0/h;->J:I

    iget v3, v2, LO0/h;->K:I

    iput v3, v1, LO0/h;->K:I

    iget v3, v2, LO0/h;->L:I

    iput v3, v1, LO0/h;->L:I

    iget v3, v2, LO0/h;->M:I

    iput v3, v1, LO0/h;->M:I

    iget v3, v2, LO0/h;->N:I

    iput v3, v1, LO0/h;->N:I

    iget v3, v2, LO0/h;->O:F

    iput v3, v1, LO0/h;->O:F

    iget v3, v2, LO0/h;->P:F

    iput v3, v1, LO0/h;->P:F

    iget v3, v2, LO0/h;->Q:I

    iput v3, v1, LO0/h;->Q:I

    iget v3, v2, LO0/h;->R:I

    iput v3, v1, LO0/h;->R:I

    iget v3, v2, LO0/h;->S:I

    iput v3, v1, LO0/h;->S:I

    iget v3, v2, LO0/h;->T:I

    iput v3, v1, LO0/h;->T:I

    iget v3, v2, LO0/h;->U:I

    iput v3, v1, LO0/h;->U:I

    iget v3, v2, LO0/h;->V:I

    iput v3, v1, LO0/h;->V:I

    iget v3, v2, LO0/h;->W:I

    iput v3, v1, LO0/h;->W:I

    iget v3, v2, LO0/h;->X:I

    iput v3, v1, LO0/h;->X:I

    iget v3, v2, LO0/h;->Y:F

    iput v3, v1, LO0/h;->Y:F

    iget v3, v2, LO0/h;->Z:F

    iput v3, v1, LO0/h;->Z:F

    iget v3, v2, LO0/h;->a0:I

    iput v3, v1, LO0/h;->a0:I

    iget v3, v2, LO0/h;->b0:I

    iput v3, v1, LO0/h;->b0:I

    iget v3, v2, LO0/h;->c0:I

    iput v3, v1, LO0/h;->c0:I

    iget-object v3, v2, LO0/h;->f0:Ljava/lang/String;

    iput-object v3, v1, LO0/h;->f0:Ljava/lang/String;

    iget-object v3, v2, LO0/h;->d0:[I

    if-eqz v3, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, LO0/h;->d0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, LO0/h;->d0:[I

    :goto_0
    iget-object v3, v2, LO0/h;->e0:Ljava/lang/String;

    iput-object v3, v1, LO0/h;->e0:Ljava/lang/String;

    iget-boolean v3, v2, LO0/h;->g0:Z

    iput-boolean v3, v1, LO0/h;->g0:Z

    iget-boolean v3, v2, LO0/h;->h0:Z

    iput-boolean v3, v1, LO0/h;->h0:Z

    iget-boolean v2, v2, LO0/h;->i0:Z

    iput-boolean v2, v1, LO0/h;->i0:Z

    iget-object v1, v0, LO0/g;->c:LO0/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, LO0/g;->c:LO0/i;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, LO0/i;->a:I

    iput v3, v1, LO0/i;->a:I

    iget v3, v2, LO0/i;->b:I

    iput v3, v1, LO0/i;->b:I

    iget v3, v2, LO0/i;->d:F

    iput v3, v1, LO0/i;->d:F

    iget v2, v2, LO0/i;->c:F

    iput v2, v1, LO0/i;->c:F

    iget-object v1, v0, LO0/g;->b:LO0/j;

    iget-object v2, p0, LO0/g;->b:LO0/j;

    iget v3, v2, LO0/j;->a:I

    iput v3, v1, LO0/j;->a:I

    iget v3, v2, LO0/j;->c:F

    iput v3, v1, LO0/j;->c:F

    iget v3, v2, LO0/j;->d:F

    iput v3, v1, LO0/j;->d:F

    iget v2, v2, LO0/j;->b:I

    iput v2, v1, LO0/j;->b:I

    iget-object v1, v0, LO0/g;->e:LO0/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, LO0/g;->e:LO0/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, LO0/k;->a:F

    iput v3, v1, LO0/k;->a:F

    iget v3, v2, LO0/k;->b:F

    iput v3, v1, LO0/k;->b:F

    iget v3, v2, LO0/k;->c:F

    iput v3, v1, LO0/k;->c:F

    iget v3, v2, LO0/k;->d:F

    iput v3, v1, LO0/k;->d:F

    iget v3, v2, LO0/k;->e:F

    iput v3, v1, LO0/k;->e:F

    iget v3, v2, LO0/k;->f:F

    iput v3, v1, LO0/k;->f:F

    iget v3, v2, LO0/k;->g:F

    iput v3, v1, LO0/k;->g:F

    iget v3, v2, LO0/k;->h:F

    iput v3, v1, LO0/k;->h:F

    iget v3, v2, LO0/k;->i:F

    iput v3, v1, LO0/k;->i:F

    iget v3, v2, LO0/k;->j:F

    iput v3, v1, LO0/k;->j:F

    iget-boolean v3, v2, LO0/k;->k:Z

    iput-boolean v3, v1, LO0/k;->k:Z

    iget v2, v2, LO0/k;->l:F

    iput v2, v1, LO0/k;->l:F

    iget v1, p0, LO0/g;->a:I

    iput v1, v0, LO0/g;->a:I

    return-object v0
.end method
