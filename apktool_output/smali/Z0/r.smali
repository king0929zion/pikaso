.class public abstract Lz0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz0/c;

.field public static final b:Lz0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz0/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz0/r;->a:Lz0/c;

    new-instance v0, Lz0/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz0/r;->b:Lz0/n;

    return-void
.end method
