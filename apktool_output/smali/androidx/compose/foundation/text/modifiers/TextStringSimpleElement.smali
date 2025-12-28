.class public final Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lv0/B;

.field public final c:Lz0/e;

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:LA/t;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lv0/B;Lz0/e;IZIILA/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->a:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->b:Lv0/B;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->c:Lz0/e;

    iput p4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->d:I

    iput-boolean p5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->e:Z

    iput p6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->f:I

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->g:I

    iput-object p8, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->h:LA/t;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lx/m;

    invoke-direct {v0}, LP/k;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->a:Ljava/lang/String;

    iput-object v1, v0, Lx/m;->q:Ljava/lang/String;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->b:Lv0/B;

    iput-object v1, v0, Lx/m;->r:Lv0/B;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->c:Lz0/e;

    iput-object v1, v0, Lx/m;->s:Lz0/e;

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->d:I

    iput v1, v0, Lx/m;->t:I

    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->e:Z

    iput-boolean v1, v0, Lx/m;->u:Z

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->f:I

    iput v1, v0, Lx/m;->v:I

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->g:I

    iput v1, v0, Lx/m;->w:I

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->h:LA/t;

    iput-object v1, v0, Lx/m;->x:LA/t;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 13

    check-cast p1, Lx/m;

    iget-object v0, p1, Lx/m;->x:LA/t;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->h:LA/t;

    invoke-static {v1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iput-object v1, p1, Lx/m;->x:LA/t;

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->b:Lv0/B;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lx/m;->r:Lv0/B;

    if-eq v3, v0, :cond_0

    iget-object v4, v3, Lv0/B;->a:Lv0/v;

    iget-object v0, v0, Lv0/B;->a:Lv0/v;

    invoke-virtual {v4, v0}, Lv0/v;->b(Lv0/v;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iget-object v4, p1, Lx/m;->q:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->a:Ljava/lang/String;

    invoke-static {v4, v5}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    iput-object v5, p1, Lx/m;->q:Ljava/lang/String;

    iput-object v6, p1, Lx/m;->B:Lx/k;

    move v4, v1

    :goto_2
    iget-object v5, p1, Lx/m;->r:Lv0/B;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v5, v3, :cond_4

    iget-object v7, v3, Lv0/B;->b:Lv0/n;

    iget-object v8, v5, Lv0/B;->b:Lv0/n;

    invoke-static {v8, v7}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v5, v5, Lv0/B;->a:Lv0/v;

    iget-object v7, v3, Lv0/B;->a:Lv0/v;

    invoke-virtual {v5, v7}, Lv0/v;->a(Lv0/v;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    move v5, v2

    goto :goto_4

    :cond_4
    :goto_3
    move v5, v1

    :goto_4
    xor-int/2addr v5, v1

    iput-object v3, p1, Lx/m;->r:Lv0/B;

    iget v3, p1, Lx/m;->w:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->g:I

    if-eq v3, v7, :cond_5

    iput v7, p1, Lx/m;->w:I

    move v5, v1

    :cond_5
    iget v3, p1, Lx/m;->v:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->f:I

    if-eq v3, v7, :cond_6

    iput v7, p1, Lx/m;->v:I

    move v5, v1

    :cond_6
    iget-boolean v3, p1, Lx/m;->u:Z

    iget-boolean v7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->e:Z

    if-eq v3, v7, :cond_7

    iput-boolean v7, p1, Lx/m;->u:Z

    move v5, v1

    :cond_7
    iget-object v3, p1, Lx/m;->s:Lz0/e;

    iget-object v7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->c:Lz0/e;

    invoke-static {v3, v7}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    iput-object v7, p1, Lx/m;->s:Lz0/e;

    move v5, v1

    :cond_8
    iget v3, p1, Lx/m;->t:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->d:I

    invoke-static {v3, v7}, La/a;->z(II)Z

    move-result v3

    if-nez v3, :cond_9

    iput v7, p1, Lx/m;->t:I

    goto :goto_5

    :cond_9
    move v1, v5

    :goto_5
    if-nez v4, :cond_a

    if-eqz v1, :cond_b

    :cond_a
    invoke-virtual {p1}, Lx/m;->f0()Lx/g;

    move-result-object v3

    iget-object v5, p1, Lx/m;->q:Ljava/lang/String;

    iget-object v7, p1, Lx/m;->r:Lv0/B;

    iget-object v8, p1, Lx/m;->s:Lz0/e;

    iget v9, p1, Lx/m;->t:I

    iget-boolean v10, p1, Lx/m;->u:Z

    iget v11, p1, Lx/m;->v:I

    iget v12, p1, Lx/m;->w:I

    iput-object v5, v3, Lx/g;->a:Ljava/lang/String;

    iput-object v7, v3, Lx/g;->b:Lv0/B;

    iput-object v8, v3, Lx/g;->c:Lz0/e;

    iput v9, v3, Lx/g;->d:I

    iput-boolean v10, v3, Lx/g;->e:Z

    iput v11, v3, Lx/g;->f:I

    iput v12, v3, Lx/g;->g:I

    iput-object v6, v3, Lx/g;->j:Lv0/a;

    iput-object v6, v3, Lx/g;->n:Lv0/m;

    iput-object v6, v3, Lx/g;->o:LG0/f;

    invoke-static {v2, v2, v2, v2}, La/a;->q(IIII)J

    move-result-wide v5

    iput-wide v5, v3, Lx/g;->p:J

    invoke-static {v2, v2}, Lr2/a;->d(II)J

    move-result-wide v5

    iput-wide v5, v3, Lx/g;->l:J

    iput-boolean v2, v3, Lx/g;->k:Z

    :cond_b
    iget-boolean v2, p1, LP/k;->p:Z

    if-nez v2, :cond_c

    goto :goto_6

    :cond_c
    if-nez v4, :cond_d

    if-eqz v0, :cond_e

    iget-object v2, p1, Lx/m;->A:Lx/l;

    if-eqz v2, :cond_e

    :cond_d
    invoke-static {p1}, Ln0/C;->m(Ln0/l0;)V

    :cond_e
    if-nez v4, :cond_f

    if-eqz v1, :cond_10

    :cond_f
    invoke-static {p1}, Ln0/C;->l(Ln0/s;)V

    invoke-static {p1}, Ln0/C;->k(Ln0/k;)V

    :cond_10
    if-eqz v0, :cond_11

    invoke-static {p1}, Ln0/C;->k(Ln0/k;)V

    :cond_11
    :goto_6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->h:LA/t;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->h:LA/t;

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->a:Ljava/lang/String;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->b:Lv0/B;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->b:Lv0/B;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->c:Lz0/e;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->c:Lz0/e;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->d:I

    iget v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->d:I

    invoke-static {v1, v3}, La/a;->z(II)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->e:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->e:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->f:I

    iget v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->f:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->g:I

    iget p1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->g:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->b:Lv0/B;

    invoke-virtual {v2}, Lv0/B;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->c:Lz0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->d:I

    invoke-static {v2, v0, v1}, LA/a;->a(III)I

    move-result v0

    iget-boolean v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->f:I

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->g:I

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->h:LA/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method
