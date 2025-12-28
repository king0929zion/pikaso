.class public final Lx2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lq2/a;


# instance fields
.field public d:I

.field public e:I

.field public f:I

.field public g:Lu2/d;

.field public h:I

.field public final synthetic i:Lx2/b;


# direct methods
.method public constructor <init>(Lx2/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/a;->i:Lx2/b;

    const/4 v0, -0x1

    iput v0, p0, Lx2/a;->d:I

    iget v0, p1, Lx2/b;->b:I

    iget-object p1, p1, Lx2/b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, LZ/b;->k(III)I

    move-result p1

    iput p1, p0, Lx2/a;->e:I

    iput p1, p0, Lx2/a;->f:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget v0, p0, Lx2/a;->f:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, Lx2/a;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lx2/a;->g:Lu2/d;

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lx2/a;->i:Lx2/b;

    iget v3, v2, Lx2/b;->c:I

    iget-object v4, v2, Lx2/b;->a:Ljava/lang/String;

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-lez v3, :cond_1

    iget v7, p0, Lx2/a;->h:I

    add-int/2addr v7, v6

    iput v7, p0, Lx2/a;->h:I

    if-ge v7, v3, :cond_2

    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    if-le v0, v3, :cond_3

    :cond_2
    new-instance v0, Lu2/d;

    iget v1, p0, Lx2/a;->e:I

    invoke-static {v4}, Lx2/j;->g(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v6}, Lu2/b;-><init>(III)V

    iput-object v0, p0, Lx2/a;->g:Lu2/d;

    iput v5, p0, Lx2/a;->f:I

    goto :goto_0

    :cond_3
    iget-object v0, v2, Lx2/b;->d:Lx2/i;

    iget v2, p0, Lx2/a;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Lx2/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/g;

    if-nez v0, :cond_4

    new-instance v0, Lu2/d;

    iget v1, p0, Lx2/a;->e:I

    invoke-static {v4}, Lx2/j;->g(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v6}, Lu2/b;-><init>(III)V

    iput-object v0, p0, Lx2/a;->g:Lu2/d;

    iput v5, p0, Lx2/a;->f:I

    goto :goto_0

    :cond_4
    iget-object v2, v0, Lc2/g;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v0, v0, Lc2/g;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v3, p0, Lx2/a;->e:I

    invoke-static {v3, v2}, LZ/b;->R(II)Lu2/d;

    move-result-object v3

    iput-object v3, p0, Lx2/a;->g:Lu2/d;

    add-int/2addr v2, v0

    iput v2, p0, Lx2/a;->e:I

    if-nez v0, :cond_5

    move v1, v6

    :cond_5
    add-int/2addr v2, v1

    iput v2, p0, Lx2/a;->f:I

    :goto_0
    iput v6, p0, Lx2/a;->d:I

    :goto_1
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lx2/a;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lx2/a;->a()V

    :cond_0
    iget v0, p0, Lx2/a;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lx2/a;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lx2/a;->a()V

    :cond_0
    iget v0, p0, Lx2/a;->d:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx2/a;->g:Lu2/d;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, Lx2/a;->g:Lu2/d;

    iput v1, p0, Lx2/a;->d:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
