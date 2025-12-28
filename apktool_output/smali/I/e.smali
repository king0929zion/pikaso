.class public LI/e;
.super LI/d;
.source "SourceFile"


# instance fields
.field public final g:LL/d;

.field public h:Ljava/lang/Object;

.field public i:Z

.field public j:I


# direct methods
.method public constructor <init>(LL/d;[LI/o;)V
    .locals 1

    iget-object v0, p1, LL/d;->e:LI/n;

    invoke-direct {p0, v0, p2}, LI/d;-><init>(LI/n;[LI/o;)V

    iput-object p1, p0, LI/e;->g:LL/d;

    iget p1, p1, LL/d;->g:I

    iput p1, p0, LI/e;->j:I

    return-void
.end method


# virtual methods
.method public final c(ILI/n;Ljava/lang/Object;I)V
    .locals 5

    mul-int/lit8 v0, p4, 0x5

    iget-object v1, p0, LI/d;->d:[LI/o;

    const/16 v2, 0x1e

    if-le v0, v2, :cond_1

    aget-object p1, v1, p4

    iget-object p2, p2, LI/n;->d:[Ljava/lang/Object;

    array-length v0, p2

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v0, v2}, LI/o;->a([Ljava/lang/Object;II)V

    :goto_0
    aget-object p1, v1, p4

    iget-object p2, p1, LI/o;->d:[Ljava/lang/Object;

    iget p1, p1, LI/o;->f:I

    aget-object p1, p2, p1

    invoke-static {p1, p3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    aget-object p1, v1, p4

    iget p2, p1, LI/o;->f:I

    add-int/lit8 p2, p2, 0x2

    iput p2, p1, LI/o;->f:I

    goto :goto_0

    :cond_0
    iput p4, p0, LI/d;->e:I

    return-void

    :cond_1
    invoke-static {p1, v0}, Lr2/a;->H(II)I

    move-result v0

    const/4 v2, 0x1

    shl-int v0, v2, v0

    invoke-virtual {p2, v0}, LI/n;->h(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p2, v0}, LI/n;->f(I)I

    move-result p1

    aget-object p3, v1, p4

    iget-object v0, p2, LI/n;->d:[Ljava/lang/Object;

    iget p2, p2, LI/n;->a:I

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    invoke-virtual {p3, v0, p2, p1}, LI/o;->a([Ljava/lang/Object;II)V

    iput p4, p0, LI/d;->e:I

    return-void

    :cond_2
    invoke-virtual {p2, v0}, LI/n;->t(I)I

    move-result v0

    invoke-virtual {p2, v0}, LI/n;->s(I)LI/n;

    move-result-object v3

    aget-object v1, v1, p4

    iget-object v4, p2, LI/n;->d:[Ljava/lang/Object;

    iget p2, p2, LI/n;->a:I

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    invoke-virtual {v1, v4, p2, v0}, LI/o;->a([Ljava/lang/Object;II)V

    add-int/2addr p4, v2

    invoke-virtual {p0, p1, v3, p3, p4}, LI/e;->c(ILI/n;Ljava/lang/Object;I)V

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LI/e;->g:LL/d;

    iget v0, v0, LL/d;->g:I

    iget v1, p0, LI/e;->j:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, LI/d;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LI/d;->d:[LI/o;

    iget v1, p0, LI/d;->e:I

    aget-object v0, v0, v1

    iget-object v1, v0, LI/o;->d:[Ljava/lang/Object;

    iget v0, v0, LI/o;->f:I

    aget-object v0, v1, v0

    iput-object v0, p0, LI/e;->h:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, LI/e;->i:Z

    invoke-super {p0}, LI/d;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 5

    iget-boolean v0, p0, LI/e;->i:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LI/d;->f:Z

    const/4 v1, 0x0

    iget-object v2, p0, LI/e;->g:LL/d;

    if-eqz v0, :cond_2

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/d;->d:[LI/o;

    iget v3, p0, LI/d;->e:I

    aget-object v0, v0, v3

    iget-object v3, v0, LI/o;->d:[Ljava/lang/Object;

    iget v0, v0, LI/o;->f:I

    aget-object v0, v3, v0

    iget-object v3, p0, LI/e;->h:Ljava/lang/Object;

    invoke-static {v2}, Lp2/r;->b(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget-object v4, v2, LL/d;->e:LI/n;

    invoke-virtual {p0, v3, v4, v0, v1}, LI/e;->c(ILI/n;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    iget-object v0, p0, LI/e;->h:Ljava/lang/Object;

    invoke-static {v2}, Lp2/r;->b(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, LI/e;->h:Ljava/lang/Object;

    iput-boolean v1, p0, LI/e;->i:Z

    iget v0, v2, LL/d;->g:I

    iput v0, p0, LI/e;->j:I

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
