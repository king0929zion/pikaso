.class public final Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Lv0/c;

.field public final b:Lv0/B;

.field public final c:Lz0/e;

.field public final d:Lo2/c;

.field public final e:I

.field public final f:Z

.field public final g:I

.field public final h:I

.field public final i:LA/t;


# direct methods
.method public constructor <init>(Lv0/c;Lv0/B;Lz0/e;Lo2/c;IZIILA/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->a:Lv0/c;

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->b:Lv0/B;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->c:Lz0/e;

    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->d:Lo2/c;

    iput p5, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->e:I

    iput-boolean p6, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->f:Z

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->g:I

    iput p8, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->h:I

    iput-object p9, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->i:LA/t;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 3

    new-instance v0, Lx/j;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->a:Lv0/c;

    invoke-direct {v0}, LP/k;-><init>()V

    iput-object v1, v0, Lx/j;->q:Lv0/c;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->b:Lv0/B;

    iput-object v1, v0, Lx/j;->r:Lv0/B;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->c:Lz0/e;

    iput-object v1, v0, Lx/j;->s:Lz0/e;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->d:Lo2/c;

    iput-object v1, v0, Lx/j;->t:Lo2/c;

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->e:I

    iput v1, v0, Lx/j;->u:I

    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->f:Z

    iput-boolean v1, v0, Lx/j;->v:Z

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->g:I

    iput v1, v0, Lx/j;->w:I

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->h:I

    iput v1, v0, Lx/j;->x:I

    const/4 v1, 0x0

    iput-object v1, v0, Lx/j;->y:Ljava/util/List;

    iput-object v1, v0, Lx/j;->z:Lo2/c;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->i:LA/t;

    iput-object v2, v0, Lx/j;->A:LA/t;

    iput-object v1, v0, Lx/j;->B:Lo2/c;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 14

    check-cast p1, Lx/j;

    iget-object v0, p1, Lx/j;->A:LA/t;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->i:LA/t;

    invoke-static {v1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iput-object v1, p1, Lx/j;->A:LA/t;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->b:Lv0/B;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lx/j;->r:Lv0/B;

    if-eq v1, v0, :cond_0

    iget-object v4, v1, Lv0/B;->a:Lv0/v;

    iget-object v0, v0, Lv0/B;->a:Lv0/v;

    invoke-virtual {v4, v0}, Lv0/v;->b(Lv0/v;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->a:Lv0/c;

    iget-object v5, p1, Lx/j;->q:Lv0/c;

    iget-object v5, v5, Lv0/c;->d:Ljava/lang/String;

    iget-object v6, v4, Lv0/c;->d:Ljava/lang/String;

    invoke-static {v5, v6}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, p1, Lx/j;->q:Lv0/c;

    sget-object v7, Ld2/s;->d:Ld2/s;

    iget-object v6, v6, Lv0/c;->e:Ljava/util/List;

    if-nez v6, :cond_2

    move-object v6, v7

    :cond_2
    iget-object v8, v4, Lv0/c;->e:Ljava/util/List;

    if-nez v8, :cond_3

    move-object v8, v7

    :cond_3
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    iget-object v8, p1, Lx/j;->q:Lv0/c;

    iget-object v8, v8, Lv0/c;->f:Ljava/util/List;

    if-nez v8, :cond_4

    move-object v8, v7

    :cond_4
    iget-object v9, v4, Lv0/c;->f:Ljava/util/List;

    if-nez v9, :cond_5

    goto :goto_2

    :cond_5
    move-object v7, v9

    :goto_2
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    iget-object v8, p1, Lx/j;->q:Lv0/c;

    iget-object v8, v8, Lv0/c;->g:Ljava/util/List;

    iget-object v9, v4, Lv0/c;->g:Ljava/util/List;

    invoke-static {v8, v9}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v5, :cond_7

    if-eqz v6, :cond_7

    if-eqz v7, :cond_7

    if-nez v8, :cond_6

    goto :goto_3

    :cond_6
    move v6, v3

    goto :goto_4

    :cond_7
    :goto_3
    move v6, v2

    :goto_4
    if-eqz v6, :cond_8

    iput-object v4, p1, Lx/j;->q:Lv0/c;

    :cond_8
    const/4 v4, 0x0

    if-nez v5, :cond_9

    iput-object v4, p1, Lx/j;->F:Lx/h;

    :cond_9
    iget-object v5, p1, Lx/j;->r:Lv0/B;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v5, v1, :cond_b

    iget-object v7, v1, Lv0/B;->b:Lv0/n;

    iget-object v8, v5, Lv0/B;->b:Lv0/n;

    invoke-static {v8, v7}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    iget-object v5, v5, Lv0/B;->a:Lv0/v;

    iget-object v7, v1, Lv0/B;->a:Lv0/v;

    invoke-virtual {v5, v7}, Lv0/v;->a(Lv0/v;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_5

    :cond_a
    move v5, v3

    goto :goto_6

    :cond_b
    :goto_5
    move v5, v2

    :goto_6
    xor-int/2addr v5, v2

    iput-object v1, p1, Lx/j;->r:Lv0/B;

    iget-object v1, p1, Lx/j;->y:Ljava/util/List;

    invoke-static {v1, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    iput-object v4, p1, Lx/j;->y:Ljava/util/List;

    move v5, v2

    :cond_c
    iget v1, p1, Lx/j;->x:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->h:I

    if-eq v1, v7, :cond_d

    iput v7, p1, Lx/j;->x:I

    move v5, v2

    :cond_d
    iget v1, p1, Lx/j;->w:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->g:I

    if-eq v1, v7, :cond_e

    iput v7, p1, Lx/j;->w:I

    move v5, v2

    :cond_e
    iget-boolean v1, p1, Lx/j;->v:Z

    iget-boolean v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->f:Z

    if-eq v1, v7, :cond_f

    iput-boolean v7, p1, Lx/j;->v:Z

    move v5, v2

    :cond_f
    iget-object v1, p1, Lx/j;->s:Lz0/e;

    iget-object v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->c:Lz0/e;

    invoke-static {v1, v7}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    iput-object v7, p1, Lx/j;->s:Lz0/e;

    move v5, v2

    :cond_10
    iget v1, p1, Lx/j;->u:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->e:I

    invoke-static {v1, v7}, La/a;->z(II)Z

    move-result v1

    if-nez v1, :cond_11

    iput v7, p1, Lx/j;->u:I

    move v5, v2

    :cond_11
    iget-object v1, p1, Lx/j;->t:Lo2/c;

    iget-object v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->d:Lo2/c;

    if-eq v1, v7, :cond_12

    iput-object v7, p1, Lx/j;->t:Lo2/c;

    move v3, v2

    :cond_12
    iget-object v1, p1, Lx/j;->z:Lo2/c;

    if-eqz v1, :cond_13

    iput-object v4, p1, Lx/j;->z:Lo2/c;

    move v3, v2

    :cond_13
    invoke-static {v4, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    move v3, v2

    :cond_14
    iget-object v1, p1, Lx/j;->B:Lo2/c;

    if-eqz v1, :cond_15

    iput-object v4, p1, Lx/j;->B:Lo2/c;

    goto :goto_7

    :cond_15
    move v2, v3

    :goto_7
    if-nez v6, :cond_16

    if-nez v5, :cond_16

    if-eqz v2, :cond_17

    :cond_16
    invoke-virtual {p1}, Lx/j;->f0()Lx/f;

    move-result-object v1

    iget-object v3, p1, Lx/j;->q:Lv0/c;

    iget-object v7, p1, Lx/j;->r:Lv0/B;

    iget-object v8, p1, Lx/j;->s:Lz0/e;

    iget v9, p1, Lx/j;->u:I

    iget-boolean v10, p1, Lx/j;->v:Z

    iget v11, p1, Lx/j;->w:I

    iget v12, p1, Lx/j;->x:I

    iget-object v13, p1, Lx/j;->y:Ljava/util/List;

    iput-object v3, v1, Lx/f;->a:Lv0/c;

    iput-object v7, v1, Lx/f;->b:Lv0/B;

    iput-object v8, v1, Lx/f;->c:Lz0/e;

    iput v9, v1, Lx/f;->d:I

    iput-boolean v10, v1, Lx/f;->e:Z

    iput v11, v1, Lx/f;->f:I

    iput v12, v1, Lx/f;->g:I

    iput-object v13, v1, Lx/f;->h:Ljava/util/List;

    iput-object v4, v1, Lx/f;->l:La1/c;

    iput-object v4, v1, Lx/f;->n:Lv0/y;

    :cond_17
    iget-boolean v1, p1, LP/k;->p:Z

    if-nez v1, :cond_18

    goto :goto_8

    :cond_18
    if-nez v6, :cond_19

    if-eqz v0, :cond_1a

    iget-object v1, p1, Lx/j;->E:Lx/i;

    if-eqz v1, :cond_1a

    :cond_19
    invoke-static {p1}, Ln0/C;->m(Ln0/l0;)V

    :cond_1a
    if-nez v6, :cond_1b

    if-nez v5, :cond_1b

    if-eqz v2, :cond_1c

    :cond_1b
    invoke-static {p1}, Ln0/C;->l(Ln0/s;)V

    invoke-static {p1}, Ln0/C;->k(Ln0/k;)V

    :cond_1c
    if-eqz v0, :cond_1d

    invoke-static {p1}, Ln0/C;->k(Ln0/k;)V

    :cond_1d
    :goto_8
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->i:LA/t;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->i:LA/t;

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->a:Lv0/c;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->a:Lv0/c;

    invoke-virtual {v1, v3}, Lv0/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->b:Lv0/B;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->b:Lv0/B;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    const/4 v1, 0x0

    invoke-static {v1, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->c:Lz0/e;

    iget-object v4, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->c:Lz0/e;

    invoke-static {v3, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->d:Lo2/c;

    iget-object v4, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->d:Lo2/c;

    if-eq v3, v4, :cond_7

    return v2

    :cond_7
    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->e:I

    iget v4, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->e:I

    invoke-static {v3, v4}, La/a;->z(II)Z

    move-result v3

    if-nez v3, :cond_8

    return v2

    :cond_8
    iget-boolean v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->f:Z

    iget-boolean v4, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->f:Z

    if-eq v3, v4, :cond_9

    return v2

    :cond_9
    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->g:I

    iget v4, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->g:I

    if-eq v3, v4, :cond_a

    return v2

    :cond_a
    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->h:I

    iget p1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->h:I

    if-eq v3, p1, :cond_b

    return v2

    :cond_b
    invoke-static {v1, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->a:Lv0/c;

    invoke-virtual {v0}, Lv0/c;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->b:Lv0/B;

    invoke-virtual {v2}, Lv0/B;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->c:Lz0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->d:Lo2/c;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->e:I

    invoke-static {v3, v0, v1}, LA/a;->a(III)I

    move-result v0

    iget-boolean v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->f:Z

    invoke-static {v3}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->g:I

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->h:I

    add-int/2addr v3, v0

    const v0, 0xe1781

    mul-int/2addr v3, v0

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->i:LA/t;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v3, v2

    mul-int/2addr v3, v1

    return v3
.end method
