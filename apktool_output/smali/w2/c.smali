.class public final Lw2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lq2/a;


# instance fields
.field public final d:Ljava/util/Iterator;

.field public e:I

.field public f:Ljava/lang/Object;

.field public final synthetic g:Lw2/d;


# direct methods
.method public constructor <init>(Lw2/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/c;->g:Lw2/d;

    iget-object p1, p1, Lw2/d;->b:Ljava/lang/Object;

    check-cast p1, Lw2/e;

    new-instance v0, Lw2/k;

    invoke-direct {v0, p1}, Lw2/k;-><init>(Lw2/e;)V

    iput-object v0, p0, Lw2/c;->d:Ljava/util/Iterator;

    const/4 p1, -0x1

    iput p1, p0, Lw2/c;->e:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    :cond_0
    iget-object v0, p0, Lw2/c;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lw2/c;->g:Lw2/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lw2/j;->e:Lw2/j;

    invoke-virtual {v1, v0}, Lw2/j;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Lw2/c;->f:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lw2/c;->e:I

    return-void

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lw2/c;->e:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lw2/c;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lw2/c;->a()V

    :cond_0
    iget v0, p0, Lw2/c;->e:I

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

    iget v0, p0, Lw2/c;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lw2/c;->a()V

    :cond_0
    iget v0, p0, Lw2/c;->e:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw2/c;->f:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lw2/c;->f:Ljava/lang/Object;

    iput v1, p0, Lw2/c;->e:I

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
