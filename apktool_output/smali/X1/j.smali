.class public final LX1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/a;

.field public b:La/a;

.field public c:La/a;

.field public d:La/a;

.field public e:LX1/c;

.field public f:LX1/c;

.field public g:LX1/c;

.field public h:LX1/c;

.field public i:LX1/e;

.field public j:LX1/e;

.field public k:LX1/e;

.field public l:LX1/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX1/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LX1/j;->a:La/a;

    new-instance v0, LX1/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LX1/j;->b:La/a;

    new-instance v0, LX1/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LX1/j;->c:La/a;

    new-instance v0, LX1/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LX1/j;->d:La/a;

    new-instance v0, LX1/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/a;-><init>(F)V

    iput-object v0, p0, LX1/j;->e:LX1/c;

    new-instance v0, LX1/a;

    invoke-direct {v0, v1}, LX1/a;-><init>(F)V

    iput-object v0, p0, LX1/j;->f:LX1/c;

    new-instance v0, LX1/a;

    invoke-direct {v0, v1}, LX1/a;-><init>(F)V

    iput-object v0, p0, LX1/j;->g:LX1/c;

    new-instance v0, LX1/a;

    invoke-direct {v0, v1}, LX1/a;-><init>(F)V

    iput-object v0, p0, LX1/j;->h:LX1/c;

    new-instance v0, LX1/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    iput-object v0, p0, LX1/j;->i:LX1/e;

    new-instance v0, LX1/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    iput-object v0, p0, LX1/j;->j:LX1/e;

    new-instance v0, LX1/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    iput-object v0, p0, LX1/j;->k:LX1/e;

    new-instance v0, LX1/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    iput-object v0, p0, LX1/j;->l:LX1/e;

    return-void
.end method

.method public static b(La/a;)V
    .locals 1

    instance-of v0, p0, LX1/i;

    if-eqz v0, :cond_0

    check-cast p0, LX1/i;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    instance-of v0, p0, LX1/d;

    if-eqz v0, :cond_1

    check-cast p0, LX1/d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()LX1/k;
    .locals 2

    new-instance v0, LX1/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, LX1/j;->a:La/a;

    iput-object v1, v0, LX1/k;->a:La/a;

    iget-object v1, p0, LX1/j;->b:La/a;

    iput-object v1, v0, LX1/k;->b:La/a;

    iget-object v1, p0, LX1/j;->c:La/a;

    iput-object v1, v0, LX1/k;->c:La/a;

    iget-object v1, p0, LX1/j;->d:La/a;

    iput-object v1, v0, LX1/k;->d:La/a;

    iget-object v1, p0, LX1/j;->e:LX1/c;

    iput-object v1, v0, LX1/k;->e:LX1/c;

    iget-object v1, p0, LX1/j;->f:LX1/c;

    iput-object v1, v0, LX1/k;->f:LX1/c;

    iget-object v1, p0, LX1/j;->g:LX1/c;

    iput-object v1, v0, LX1/k;->g:LX1/c;

    iget-object v1, p0, LX1/j;->h:LX1/c;

    iput-object v1, v0, LX1/k;->h:LX1/c;

    iget-object v1, p0, LX1/j;->i:LX1/e;

    iput-object v1, v0, LX1/k;->i:LX1/e;

    iget-object v1, p0, LX1/j;->j:LX1/e;

    iput-object v1, v0, LX1/k;->j:LX1/e;

    iget-object v1, p0, LX1/j;->k:LX1/e;

    iput-object v1, v0, LX1/k;->k:LX1/e;

    iget-object v1, p0, LX1/j;->l:LX1/e;

    iput-object v1, v0, LX1/k;->l:LX1/e;

    return-object v0
.end method
