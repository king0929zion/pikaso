.class final Landroidx/compose/foundation/ClickableElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Ls/g;

.field public final b:Lq/H;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Lt0/e;

.field public final f:LA0/c;


# direct methods
.method public constructor <init>(Ls/g;Lq/H;ZLjava/lang/String;Lt0/e;LA0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/ClickableElement;->a:Ls/g;

    iput-object p2, p0, Landroidx/compose/foundation/ClickableElement;->b:Lq/H;

    iput-boolean p3, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    iput-object p4, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/foundation/ClickableElement;->e:Lt0/e;

    iput-object p6, p0, Landroidx/compose/foundation/ClickableElement;->f:LA0/c;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 8

    new-instance v7, Lq/l;

    iget-object v6, p0, Landroidx/compose/foundation/ClickableElement;->f:LA0/c;

    iget-boolean v3, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->a:Ls/g;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->b:Lq/H;

    iget-object v5, p0, Landroidx/compose/foundation/ClickableElement;->e:Lt0/e;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lq/l;-><init>(Ls/g;Lq/H;ZLjava/lang/String;Lt0/e;LA0/c;)V

    return-object v7
.end method

.method public final e(LP/k;)V
    .locals 7

    check-cast p1, Lq/l;

    iget-object v0, p1, Lq/l;->G:Ls/g;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->a:Ls/g;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lq/l;->i0()V

    iput-object v1, p1, Lq/l;->G:Ls/g;

    iput-object v1, p1, Lq/l;->s:Ls/g;

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p1, Lq/l;->t:Lq/H;

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->b:Lq/H;

    invoke-static {v1, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v4, p1, Lq/l;->t:Lq/H;

    move v0, v3

    :cond_1
    iget-boolean v1, p1, Lq/l;->w:Z

    iget-boolean v4, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    iget-object v5, p1, Lq/l;->z:Lq/u;

    if-eq v1, v4, :cond_3

    iget-object v1, p1, Lq/l;->y:Lq/q;

    if-eqz v4, :cond_2

    invoke-virtual {p1, v1}, Ln0/i;->f0(Ln0/h;)V

    invoke-virtual {p1, v5}, Ln0/i;->f0(Ln0/h;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v1}, Ln0/i;->g0(Ln0/h;)V

    invoke-virtual {p1, v5}, Ln0/i;->g0(Ln0/h;)V

    invoke-virtual {p1}, Lq/l;->i0()V

    :goto_1
    invoke-static {p1}, Ln0/C;->m(Ln0/l0;)V

    iput-boolean v4, p1, Lq/l;->w:Z

    :cond_3
    iget-object v1, p1, Lq/l;->u:Ljava/lang/String;

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    invoke-static {v1, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v4, p1, Lq/l;->u:Ljava/lang/String;

    invoke-static {p1}, Ln0/C;->m(Ln0/l0;)V

    :cond_4
    iget-object v1, p1, Lq/l;->v:Lt0/e;

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->e:Lt0/e;

    invoke-static {v1, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iput-object v4, p1, Lq/l;->v:Lt0/e;

    invoke-static {p1}, Ln0/C;->m(Ln0/l0;)V

    :cond_5
    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->f:LA0/c;

    iput-object v1, p1, Lq/l;->x:LA0/c;

    iget-boolean v1, p1, Lq/l;->H:Z

    iget-object v4, p1, Lq/l;->G:Ls/g;

    if-nez v4, :cond_6

    iget-object v6, p1, Lq/l;->t:Lq/H;

    if-eqz v6, :cond_6

    move v6, v3

    goto :goto_2

    :cond_6
    move v6, v2

    :goto_2
    if-eq v1, v6, :cond_8

    if-nez v4, :cond_7

    iget-object v1, p1, Lq/l;->t:Lq/H;

    if-eqz v1, :cond_7

    move v2, v3

    :cond_7
    iput-boolean v2, p1, Lq/l;->H:Z

    if-nez v2, :cond_8

    iget-object v1, p1, Lq/l;->B:Ln0/h;

    if-nez v1, :cond_8

    goto :goto_3

    :cond_8
    move v3, v0

    :goto_3
    if-eqz v3, :cond_b

    iget-object v0, p1, Lq/l;->B:Ln0/h;

    if-nez v0, :cond_9

    iget-boolean v1, p1, Lq/l;->H:Z

    if-nez v1, :cond_b

    :cond_9
    if-eqz v0, :cond_a

    invoke-virtual {p1, v0}, Ln0/i;->g0(Ln0/h;)V

    :cond_a
    const/4 v0, 0x0

    iput-object v0, p1, Lq/l;->B:Ln0/h;

    invoke-virtual {p1}, Lq/l;->j0()V

    :cond_b
    iget-object p1, p1, Lq/l;->s:Ls/g;

    invoke-virtual {v5, p1}, Lq/u;->i0(Ls/g;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroidx/compose/foundation/ClickableElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/ClickableElement;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->a:Ls/g;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->a:Ls/g;

    invoke-static {v2, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->b:Lq/H;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->b:Lq/H;

    invoke-static {v2, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/ClickableElement;->c:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->e:Lt0/e;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->e:Lt0/e;

    invoke-static {v2, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->f:LA0/c;

    iget-object p1, p1, Landroidx/compose/foundation/ClickableElement;->f:LA0/c;

    if-eq v2, p1, :cond_8

    return v1

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->a:Ls/g;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->b:Lq/H;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v0

    :goto_2
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->e:Lt0/e;

    if-eqz v1, :cond_3

    iget v0, v1, Lt0/e;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    :cond_3
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->f:LA0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
