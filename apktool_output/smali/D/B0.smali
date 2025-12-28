.class public final LD/B0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lq2/a;


# instance fields
.field public d:[I

.field public e:I

.field public f:[Ljava/lang/Object;

.field public g:I

.field public h:I

.field public i:Z

.field public j:I

.field public k:Ljava/util/ArrayList;

.field public l:Ljava/util/HashMap;

.field public m:Ln/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, LD/B0;->d:[I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, LD/B0;->f:[Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LD/B0;->k:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(LD/c;)I
    .locals 2

    iget-boolean v0, p0, LD/B0;->i:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LD/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p1, LD/c;->a:I

    return p1

    :cond_0
    const-string p1, "Anchor refers to a group that was removed"

    invoke-static {p1}, LD/d;->H(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Use active SlotWriter to determine anchor location instead"

    invoke-static {p1}, LD/d;->r(Ljava/lang/String;)V

    throw v1
.end method

.method public final b()LD/A0;
    .locals 2

    iget-boolean v0, p0, LD/B0;->i:Z

    if-nez v0, :cond_0

    iget v0, p0, LD/B0;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LD/B0;->h:I

    new-instance v0, LD/A0;

    invoke-direct {v0, p0}, LD/A0;-><init>(LD/B0;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read while a writer is pending"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()LD/D0;
    .locals 2

    iget-boolean v0, p0, LD/B0;->i:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget v0, p0, LD/B0;->h:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LD/B0;->i:Z

    iget v1, p0, LD/B0;->j:I

    add-int/2addr v1, v0

    iput v1, p0, LD/B0;->j:I

    new-instance v0, LD/D0;

    invoke-direct {v0, p0}, LD/D0;-><init>(LD/B0;)V

    return-object v0

    :cond_0
    const-string v0, "Cannot start a writer when a reader is pending"

    invoke-static {v0}, LD/d;->r(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "Cannot start a writer when another writer is pending"

    invoke-static {v0}, LD/d;->r(Ljava/lang/String;)V

    throw v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LD/K;

    const/4 v1, 0x0

    iget v2, p0, LD/B0;->e:I

    invoke-direct {v0, p0, v1, v2}, LD/K;-><init>(LD/B0;II)V

    return-object v0
.end method
