.class public final Lt0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln0/z;

.field public final b:Lt0/c;


# direct methods
.method public constructor <init>(Ln0/z;Lt0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/l;->a:Ln0/z;

    iput-object p2, p0, Lt0/l;->b:Lt0/c;

    return-void
.end method


# virtual methods
.method public final a()Lt0/k;
    .locals 5

    new-instance v0, Lt0/g;

    invoke-direct {v0}, Lt0/g;-><init>()V

    new-instance v1, Lt0/k;

    const/4 v2, 0x0

    iget-object v3, p0, Lt0/l;->b:Lt0/c;

    iget-object v4, p0, Lt0/l;->a:Ln0/z;

    invoke-direct {v1, v3, v2, v4, v0}, Lt0/k;-><init>(LP/k;ZLn0/z;Lt0/g;)V

    return-object v1
.end method
